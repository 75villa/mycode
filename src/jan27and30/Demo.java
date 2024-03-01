package jan27and30;

public class Demo {
    static {
        System.out.println("Print in static block"); // this will be called because of object called in main method
    }

    public static void test() {
        System.out.println("Static method from test"); // because of static
    }

    public void show() {
        System.out.println("Non static method"); //  called only if we create reference in main method
    }

    // instance block
    {
        System.out.println("Inside the instance Block");
    }

    public static void main(String[] args) {
        // If main method empty then "Print static block" will come as a output

        new Demo();
        //  new Demo() ---- Output---> "Print static block"  and "Inside the instance block" will print
    }
}
