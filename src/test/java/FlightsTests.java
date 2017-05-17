import Model.Flight;
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
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by lm on 17.05.2017.
 */
public class FlightsTests {
    private Logger logger = LoggerFactory.getLogger(FlightsTests.class);

    public void print(Object o) {
        logger.info("Got {}", o);
    }

    @Test
    public void test1() {
        try {
            String APP_ID = "";
            String APP_KEY = "";
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet request = new HttpGet("https://api.schiphol.nl/public-flights/flights?app_id=" + APP_ID + "&app_key=" + APP_KEY);
            request.addHeader("ResourceVersion", "v3");
            HttpResponse response = httpClient.execute(request);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                String responseBody = EntityUtils.toString(response.getEntity(), "UTF-8");
                JSONParser parser = new JSONParser();
                JSONObject jsonObject = (JSONObject) parser.parse(responseBody);
                JSONArray flights = (JSONArray) jsonObject.get("flights");
                System.out.println("found " + flights.size() + " flights");
                flights.forEach(System.out::println);
                Gson gson = new Gson();
                Flight f = gson.fromJson(flights.get(0).toString(), Flight.class);
                print(f);
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
    }
}
