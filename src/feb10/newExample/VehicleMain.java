package feb10.newExample;

public class VehicleMain {

    public static void main(String[] args) {

        Car car = new Car("Honda", "CRV", 2024, 5);
        car.start();
        car.stop();
        car.displayInfo();


        MotorCycle motorCycle = new MotorCycle("My MotorCycle", "My Model", 2024, 4);
        motorCycle.start();
        motorCycle.stop();
        motorCycle.displayInfo();

        ElectricCar ec = new ElectricCar("Tesla", "new", 5, 6, 100);
        ec.start();
        ec.stop();
        ec.displayInfo();
        ec.chargeBattery();


    }
}
