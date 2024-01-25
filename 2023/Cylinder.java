public class Cylinder extends Circle {
    private int height;

    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius * height;
    }

    public double getVolume() {
        return 3 * super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder [height=" + height + "]";
    }

}
