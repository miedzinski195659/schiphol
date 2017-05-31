package Model;

import java.util.Arrays;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaggageClaim that = (BaggageClaim) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(belts, that.belts);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(belts);
    }
}
