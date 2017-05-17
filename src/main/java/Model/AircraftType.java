package Model;

/**
 * Created by lm on 17.05.2017.
 */
public class AircraftType {
    private String iatamain;

    private String iatasub;

    public String getIatamain() {
        return iatamain;
    }

    public void setIatamain(String iatamain) {
        this.iatamain = iatamain;
    }

    public String getIatasub() {
        return iatasub;
    }

    public void setIatasub(String iatasub) {
        this.iatasub = iatasub;
    }

    @Override
    public String toString() {
        return "ClassPojo [iatamain = " + iatamain + ", iatasub = " + iatasub + "]";
    }
}
