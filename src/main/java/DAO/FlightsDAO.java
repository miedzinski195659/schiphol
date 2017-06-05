package DAO;

import Model.Flight;
import Model.FlightBoard;
import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rx.Observable;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by lm on 17.05.2017.
 */
public class FlightsDAO {
    private static final Logger log = LoggerFactory.getLogger(FlightsDAO.class);

    public FlightBoard getCurrentFlightBoard() {
        FlightBoard flightBoard = new FlightBoard();
        try {
            String APP_ID = "d0540990";
            String APP_KEY = "fab126263dc5d3e0f0bcff63e05de1fe";
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet request = new HttpGet("https://api.schiphol.nl/public-flights/flights?app_id=" + APP_ID + "&app_key=" + APP_KEY);
            request.addHeader("ResourceVersion", "v3");
            HttpResponse response = httpClient.execute(request);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                String responseBody = EntityUtils.toString(response.getEntity(), "UTF-8");
                JSONParser parser = new JSONParser();
                JSONObject jsonObject = (JSONObject) parser.parse(responseBody);
                JSONArray flights = (JSONArray) jsonObject.get("flights");
                Gson gson = new Gson();
                flights.stream().forEach(o -> {
                    try {
                        flightBoard.addFlight(gson.fromJson(o.toString(), Flight.class));
                    } catch (Exception e) {
                        //Do nothing, just pass through
                    }
                });
            } else {
                System.out.println(
                        "Oops something went wrong\nHttp response code: " + response.getStatusLine().getStatusCode() + "\nHttp response body: "
                                + EntityUtils.toString(response.getEntity()));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Oops something went wrong\nPlease insert your APP_ID and APP_KEY as arguments");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
        String timeStamp = new SimpleDateFormat().format( new Date() );
        log.info("["+timeStamp+"] New data fetch!");
        return flightBoard;
    }

    public Observable<FlightBoard> rxGetCurrentFlightBoard() {
        return Observable.interval(10, TimeUnit.SECONDS).map(x -> this.getCurrentFlightBoard());
    }

}
