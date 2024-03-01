package jan27and30;

public class Car {

    public static void printDetails() {
        System.out.println("Car Details.....");
    }

    // alwayse execute static block first
    static {
        System.out.println("Inside the static block");
    }

    // non static method
    public void run() {
        System.out.println("run method called");
    }

    // instance block
    {
        System.out.println("Instance Block");
    }
}
