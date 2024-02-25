package jan20;

public class CarMain {

    public static void main(String[] args) {

        Car car = new Car();
        car.fuelCap = 100;
        car.topSpeed = 220;
        car.totalSeats = 5;
        car.manufacturer = "Honda";
        car.refuel();
        car.drive();
        car.park();
        System.out.println(car.fuelCap + "===" + car.topSpeed + "===" + car.totalSeats + "====" + car.manufacturer);
    }
}
