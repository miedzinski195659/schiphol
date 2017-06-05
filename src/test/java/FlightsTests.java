import DAO.FlightsDAO;
import Model.FlightBoard;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rx.observables.BlockingObservable;

/**
 * Created by lm on 17.05.2017.
 */
public class FlightsTests {
    private Logger logger = LoggerFactory.getLogger(FlightsTests.class);
    private FlightsDAO flightsDAO = new FlightsDAO();

    public void print(Object o) {
        logger.info("Got {}", o);
    }

    @Test
    public void test1() {
        BlockingObservable<FlightBoard> flightBoard = flightsDAO.rxGetCurrentFlightBoard().distinct().toBlocking();
        flightBoard.subscribe((x) -> print(x));
    }
}
