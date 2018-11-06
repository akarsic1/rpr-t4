package ba.unsa.etf.rpr.predavanje03;

import java.util.ArrayList;

public class ObavezniPredmet extends Predmet{
    boolean isRequired = true;

    public ObavezniPredmet(String subjectName, ArrayList<Student> studentsListening, int brojEcts) {
        this.isRequired = true;
        this.subjectName = subjectName;
        this.studentsListening = studentsListening;
        this.brojEcts = brojEcts;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }
}
