package feb17.annoymousdemo;

public class Laptop {

    public static void main(String[] args) {

        Computer cmp = new Computer() {
            // You don't need to create separate class to call abstract class method
            @Override
            public void calculate() {

                System.out.println("Calling Calculate method ");
            }

            @Override
            public void surfIn() {
                super.surfIn();
            }
        };
        cmp.calculate();
        cmp.surfIn();
    }

}
