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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AircraftType that = (AircraftType) o;

        if (iatamain != null ? !iatamain.equals(that.iatamain) : that.iatamain != null) return false;
        return iatasub != null ? iatasub.equals(that.iatasub) : that.iatasub == null;
    }

    @Override
    public int hashCode() {
        int result = iatamain != null ? iatamain.hashCode() : 0;
        result = 31 * result + (iatasub != null ? iatasub.hashCode() : 0);
        return result;
    }
}
