package feb10.polymor;

public class Circle extends Shape {

    double radius;
    static double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

}
