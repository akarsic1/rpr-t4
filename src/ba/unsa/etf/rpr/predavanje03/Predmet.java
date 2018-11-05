package ba.unsa.etf.rpr.predavanje03;

import java.util.ArrayList;

public abstract class Predmet {
    String subjectName ;
    ArrayList<Student> studentsListening = new ArrayList<Student>();
    int brojEcts ;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public ArrayList<Student> getStudentsListening() {
        return studentsListening;
    }

    public void setStudentsListening(ArrayList<Student> studentsListening) {
        this.studentsListening = studentsListening;
    }

    public int getBrojEcts() {
        return brojEcts;
    }

    public void setBrojEcts(int brojEcts) {
        this.brojEcts = brojEcts;
    }

}
