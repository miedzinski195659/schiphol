package Model;

import java.util.Arrays;

/**
 * Created by lm on 17.05.2017.
 */
public class Codeshares {
    private String[] codeshares;

    public String[] getCodeshares() {
        return codeshares;
    }

    public void setCodeshares(String[] codeshares) {
        this.codeshares = codeshares;
    }

    @Override
    public String toString() {
        return "ClassPojo [codeshares = " + codeshares + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Codeshares that = (Codeshares) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(codeshares, that.codeshares);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(codeshares);
    }
}
