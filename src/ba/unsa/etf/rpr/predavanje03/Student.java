package ba.unsa.etf.rpr.predavanje03;

public class Student {
    String studentName;
    int studentIndex;
    Semestar currentSemester;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentIndex() {
        return studentIndex;
    }

    public void setStudentIndex(int studentIndex) {
        this.studentIndex = studentIndex;
    }

    public Semestar getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(Semestar currentSemester) {
        this.currentSemester = currentSemester;
    }

}
