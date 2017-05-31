package Model;

import java.util.Arrays;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PublicFlightState that = (PublicFlightState) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(flightStates, that.flightStates);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(flightStates);
    }
}
