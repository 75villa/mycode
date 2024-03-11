package feb10.Agreegation;

public class StudentMain {
    public static void main(String[] args) {

        Student manish = new Student(101, "Manish", new StudentAddress("222 Toronto blvd", "Brampton999", "Canada", "H7R 4Q7"));

        System.out.println(manish.studentAddress.city);
    }
}
