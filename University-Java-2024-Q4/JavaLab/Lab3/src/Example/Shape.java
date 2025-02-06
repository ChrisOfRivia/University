package Example;

public abstract class Shape implements Area {
    private double area;

    public double getArea() {
        return area;
    }

    protected void setArea() {
        this.area = calculateArea();
    }
}
