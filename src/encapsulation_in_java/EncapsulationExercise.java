package encapsulation_in_java;

public class EncapsulationExercise {
    public static void main(String[] args) {

        Student student = new Student();
        student.setStudentName("Kyaw Kyaw");
        student.setStudentID(123);
        student.setRollNumber(4);

        System.out.println("Student Name        : " + student.getStudentName());
        System.out.println("Student Roll Number : " + student.getRollNumber());
        System.out.println("Student ID          : " + student.getStudentID());
    }
}
