package Model;

/**
 * Created by lm on 17.05.2017.
 */
public class BaggageClaim {
    private String[] belts;

    public String[] getBelts() {
        return belts;
    }

    public void setBelts(String[] belts) {
        this.belts = belts;
    }

    @Override
    public String toString() {
        return "ClassPojo [belts = " + belts + "]";
    }
}
