package feb10.polymor;

public class Rectangle extends Shape {

    // method overriding
//    @Override
//    public double getArea() {
//        return super.getArea();
//    }

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override // ----->Compile time check
    public double getArea() {

        return length * width;
    }
}
