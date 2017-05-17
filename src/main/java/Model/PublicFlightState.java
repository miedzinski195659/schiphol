package Model;

/**
 * Created by lm on 17.05.2017.
 */
public class PublicFlightState {
    private String[] flightStates;

    public String[] getFlightStates() {
        return flightStates;
    }

    public void setFlightStates(String[] flightStates) {
        this.flightStates = flightStates;
    }

    @Override
    public String toString() {
        return "ClassPojo [flightStates = " + flightStates + "]";
    }
}
