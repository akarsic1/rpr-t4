package ba.unsa.etf.rpr.predavanje03;

import java.util.ArrayList;

public class IzborniPredmet extends Predmet {
    boolean isRequired;

    public IzborniPredmet(String subjectName, ArrayList<Student> studentsListening,int brojEcts) {
        this.isRequired = false;
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
