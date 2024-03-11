package feb10.newExample;

public class EmpInfo { // HAS A RELATION
    public static void main(String[] args) {

        // Address address = new Address("100 bRAMPTON.STREET", "Brampton", "Canada", "L6R3P9");

        Employee manish = new Employee(101, "Manish", new Address("100 bRAMPTON.STREET", "Brampton", "Canada", "L6R3P9"));
        Employee mehta = new Employee(102, "Mehta", new Address("101 bRAMPTON.STREET", "Mississauga", "Canada", "L6R2t5"));

        System.out.println(manish.address.city);
        System.out.println(mehta.address.city);

    }

}
