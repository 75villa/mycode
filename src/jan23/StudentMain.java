package jan23;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.studentID); // null - constructor init default value
        System.out.println(student.studentName);// null - constructor init default value
        System.out.println(student.rollNo);
    }

}
