package Model;

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
}
