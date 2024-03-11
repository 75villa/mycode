package feb10.newExample;

public class ElectricCar extends Car {

    int batteryCapacity;

    public ElectricCar(String make, String model, int year, int numDoors, int batteryCapacity) {
        // super(make, model, year, numDoors);
        this.batteryCapacity = batteryCapacity;
    }


    public void chargeBattery() {
        System.out.println(this.make + " " + this.model + " " + this.year + " from charge battery method");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity...:" + this.batteryCapacity + " from Electric car battery info display method");
    }


}
