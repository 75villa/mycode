package feb10.polymor;

public class Test {

    public static void main(String[] args) {

//        Circle circle = new Circle(12);
//        System.out.println("Circle....:" + circle.getArea());
//
        // OR ----UPCASTING EXAMPLE

        Shape circle = new Circle(12);
        System.out.println("Circle....:" + circle.getArea());

        Shape rectangle = new Rectangle(10, 20);
        System.out.println("Rectangle....:" + rectangle.getArea());

        Shape square = new Square(10);
        System.out.println("Square...:" + square.getArea());
    }
}
