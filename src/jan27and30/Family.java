package jan27and30;

public class Family {
    String firstName;
    int age;
    static String lastName = "Mehta";
    static int houseNumber = 75;

    public Family(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public void printFamilyInfo() {
        System.out.println(firstName + " " + lastName + " " + age + " " + houseNumber);
    }
}
