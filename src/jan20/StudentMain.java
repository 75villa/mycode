package jan20;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student();
        student.id = 1;
        student.first_name = "Manish";
        student.last_name = "Mehta";
        student.email_id = "manishmehta1102@gmail.com";

        student.study();
        student.eat();
        student.sleep();
        System.out.println(student.first_name);
        System.out.println(student.last_name);
        System.out.println(student.id);
        System.out.println(student.email_id);
    }

}
