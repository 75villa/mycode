package feb10.newExample;

public class Car extends Vehicle {

    int numDoors;

    Car() {

    }

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors..:" + this.numDoors);
    }
}
