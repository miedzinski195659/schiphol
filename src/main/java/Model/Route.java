package Model;

import java.util.Arrays;

/**
 * Created by lm on 17.05.2017.
 */
public class Route {
    private String[] destinations;

    public String[] getDestinations() {
        return destinations;
    }

    public void setDestinations(String[] destinations) {
        this.destinations = destinations;
    }

    @Override
    public String toString() {
        return "ClassPojo [destinations = " + destinations + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Route route = (Route) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(destinations, route.destinations);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(destinations);
    }
}
