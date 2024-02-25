package jan23;

public class EmployeeDemoMain {
    public static void main(String[] args) {

        EmployeeDemo employee1 = new EmployeeDemo("101", "Manish");
        EmployeeDemo employee2 = new EmployeeDemo("102", "Manish1");
        EmployeeDemo employee3 = new EmployeeDemo("103", "Manish2");
        EmployeeDemo employee4 = new EmployeeDemo("104", "Manish3");
        EmployeeDemo employee5 = new EmployeeDemo("105", "Manish4");

        employee1.display();
        employee2.display();
        employee3.display();
        employee4.display();
        employee5.display();
    }
}
