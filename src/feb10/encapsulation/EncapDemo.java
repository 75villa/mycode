package feb10.encapsulation;

public class EncapDemo {
    public static void main(String[] args) {

        Student std = new Student(101, "Manish");
        // Student std1 = new Student(102, "Your Name");

        // std.printStudentDetails();
        // setting value
        std.setId(102);
        std.setName("My Name");
        // getting value
        System.out.println(std.getId());
        System.out.println(std.getName());

        std.printStudentDetails();
    }
}
