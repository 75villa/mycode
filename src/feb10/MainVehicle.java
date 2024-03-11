package feb10;


class MainVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.drive();
        Car car = new Car();
        car.drive();
        ElectricCar electricCar = new ElectricCar();
        electricCar.drive();
        
    }

}
