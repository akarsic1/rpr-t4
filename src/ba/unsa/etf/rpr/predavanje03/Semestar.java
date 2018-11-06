package ba.unsa.etf.rpr.predavanje03;

import java.util.ArrayList;
import java.util.Scanner;


public class Semestar {
    int semesterID;
    ArrayList<Student> allStudents = new ArrayList<Student>();
    int brojEctsObaveznih,ukupanBrojEcts;

    public Semestar(int semesterID, ArrayList<Student> allStudents, int brojEctsObaveznih) {
        this.semesterID = semesterID;
        this.allStudents = allStudents;
        this.brojEctsObaveznih = brojEctsObaveznih;
        this.ukupanBrojEcts = brojEctsObaveznih;
    }
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


    public void selectSubject(Student novi){
        allStudents.add(novi);
        ArrayList<IzborniPredmet> choose = new ArrayList<IzborniPredmet>();
        choose = PlanStudija.getIzborniPredmeti();
        System.out.print("Izaberite predmete koji nose najmanje "+(30-brojEctsObaveznih)+ " bodova(0 da završite):");
        int izbor ;
       for(int i = 1; i <= choose.size(); i++)
           System.out.println(i + " " + choose.get(i) + " - koji nosi" + choose.get(i).getBrojEcts() + " ECTS bodova");
       while(ukupanBrojEcts <= 50) {
           Scanner ulaz = new Scanner(System.in);
           izbor = ulaz.nextInt();
           if(izbor == 0 && ukupanBrojEcts < 30)System.out.println("Vaš broj ECTS bodova je manji od 30, molim izaberite još premeta.");
           else if(izbor == 0 && ukupanBrojEcts >= 30)break;
           else{
               ukupanBrojEcts += choose.get(izbor).getBrojEcts();
               choose.get(izbor).studentsListening.add(novi);
           }
       }
    }

    public void addStudent(Student novi){
        allStudents.add(novi);
    }

}
