package ba.unsa.etf.rpr.predavanje03;

import java.util.ArrayList;

public class PlanStudija {
    String nameOfMajor ;
    ArrayList<ObavezniPredmet> obavezniPredmeti = new ArrayList<ObavezniPredmet>();
    static ArrayList<IzborniPredmet> izborniPredmeti = new ArrayList<IzborniPredmet>();

    public PlanStudija(String nameOfMajor, ArrayList<ObavezniPredmet> obavezniPredmeti) {
        this.nameOfMajor = nameOfMajor;
        this.obavezniPredmeti = obavezniPredmeti;
    }

    public String getNameOfMajor() {
        return nameOfMajor;
    }

    public void setNameOfMajor(String nameOfMajor) {
        this.nameOfMajor = nameOfMajor;
    }

    public ArrayList<ObavezniPredmet> getObavezniPredmeti() {
        return obavezniPredmeti;
    }

    public void setObavezniPredmeti(ArrayList<ObavezniPredmet> obavezniPredmeti) {
        this.obavezniPredmeti = obavezniPredmeti;
    }

    public static ArrayList<IzborniPredmet> getIzborniPredmeti() {
        return izborniPredmeti;
    }


    public void setIzborniPredmeti(ArrayList<IzborniPredmet> izborniPredmeti) {
        this.izborniPredmeti = izborniPredmeti;
    }
}
