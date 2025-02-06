package Example;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        setArea();
    }


    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
