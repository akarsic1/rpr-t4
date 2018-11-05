package ba.unsa.etf.rpr.predavanje03;

import java.util.ArrayList;

public class Semestar {
    int semesterID;
    ArrayList<Student> allStudents = new ArrayList<Student>();

    public int getSemesterID() {
        return semesterID;
    }

    public void setSemesterID(int semesterID) {
        this.semesterID = semesterID;
    }

    public ArrayList<Student> getAllStudents() {
        return allStudents;
    }

    public void setAllStudents(ArrayList<Student> allStudents) {
        this.allStudents = allStudents;
    }


    public void selectSubject(){}

    public void addStudent(Student novi){
        allStudents.add(novi);
    }

}
