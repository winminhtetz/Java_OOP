package encapsulation_in_java;

public class Student {
    private String studentName;
    private int rollNumber;
    private int studentID;

    //Setter methods
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    //getter methods
    public String getStudentName() {
        return studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getStudentID() {
        return studentID;
    }
}
