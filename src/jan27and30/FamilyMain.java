package jan27and30;

public class FamilyMain {
    public static void main(String[] args) {


        Family family1 = new Family("Manish", 50);
        Family family2 = new Family("Manish1", 25);
        Family family3 = new Family("Manish2", 75);
        Family family4 = new Family("Manish3", 100);

        family1.printFamilyInfo();
        family2.printFamilyInfo();
        family3.printFamilyInfo();
        family4.printFamilyInfo();

    }
}
