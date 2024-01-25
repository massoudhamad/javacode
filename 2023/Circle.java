public class Circle {

    protected int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

}
