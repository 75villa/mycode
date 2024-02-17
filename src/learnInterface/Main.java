package learnInterface;

import java.sql.SQLOutput;

interface Vehicle{
    void start();
    void stop();
    void accelerate();
}

class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car Start method");
    }

    @Override
    public void stop() {
        System.out.println("Car Stop Method");
    }

    @Override
    public void accelerate() {
        System.out.println("Car Accelerate Method");
    }
}

class Truck implements Vehicle{

    @Override
    public void start() {
        System.out.println("Truck start");
    }

    @Override
    public void stop() {
        System.out.println("Truck stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck accelerate");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate();
        car.stop();
        car.start();

        Truck truck = new Truck();
        truck.accelerate();
        truck.stop();
        truck.start();
    }


}
