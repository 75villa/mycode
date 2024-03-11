package feb06.oops;

public class Car extends Vehicle {
    int fuelCap;

    public Car(int fuelCap) {
        super();
        this.fuelCap = fuelCap;
    }

    // this -- referes to current class , properties
    // super -- referes to the parent class properties
    public void showCarDetails() {

        System.out.println("Fuel Capacity...:" + fuelCap);
    }

}
