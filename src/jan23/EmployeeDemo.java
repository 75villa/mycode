package jan23;

public class EmployeeDemo {

    String id;
    String firstName;
    static String companyName = "Pragra";

    public EmployeeDemo(String id, String firstName) {
        this.id = id;
        this.firstName = firstName;
        
    }

    public void display() {
        System.out.println(id);
        System.out.println(firstName);
        System.out.println(companyName);
        System.out.println();
    }
}
