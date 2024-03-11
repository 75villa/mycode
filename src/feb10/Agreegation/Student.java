package feb10.Agreegation;

public class Student {

    int studentId;
    String studentName;
    StudentAddress studentAddress;

    public Student(int studentId, String studentName, StudentAddress studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public void printDetail() {
        System.out.println(studentId);
        System.out.println(studentName);
        System.out.println(studentAddress);
    }
}
