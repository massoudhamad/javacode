public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public void setLength(double length) {
        if (length > 0.0 && length <= 20.0)
            this.length = length;
        else
            this.length = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0)
            this.width = width;
        else
            this.width = 1.0;
    }

    public double getWidth() {
        return width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getArea() {
        return length * width;
    }

}
