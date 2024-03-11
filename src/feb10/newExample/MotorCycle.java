package feb10.newExample;

public class MotorCycle extends Vehicle {
    int numCylinders;

    public MotorCycle(String make, String model, int year, int numCylinders) {
        super(make, model, year);
        this.numCylinders = numCylinders;
    }

    public void displayInfo() {
        System.out.println("Number of Cylinders...:" + this.numCylinders);
    }


}
