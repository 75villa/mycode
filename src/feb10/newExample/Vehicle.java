package feb10.newExample;

public class Vehicle {
    String make;
    String model;
    int year;

    Vehicle() {

    }

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println(this.make + " " + this.model + " " + this.year + "Start Method ");
    }

    public void stop() {
        System.out.println(this.make + " " + this.model + " " + this.year + "Stop Method ");
    }

    public void displayInfo() {
        System.out.println(this.make + " " + this.model + " " + this.year + "Display Method ");
    }
}
