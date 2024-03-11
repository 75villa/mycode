package feb10.newExample;

public class Employee {  // HAS A RELATION

    int empId;
    String name;
    Address address;

    public Employee(int empId, String name, Address address) {
        this.empId = empId;
        this.name = name;
        this.address = address;
    }

    public void printEmpDetails() {
        System.out.println(empId);
        System.out.println(name);
        System.out.println(address);
    }
}
