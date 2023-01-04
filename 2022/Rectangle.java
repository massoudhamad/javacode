public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length = 1;
        width = 1;
    }

    public void setLength(double l) {
        if (l >= 0.0 && l <= 20.0)
            length = l;
        else
            length = 0.0;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double w) {
        if (w >= 0.0 && w <= 20.0)
            width = w;
        else
            width = 0.0;
    }

    public double getWidth() {
        return width;
    }

    public String toString() {
        return "Length of Rectangle is " + getLength() + " and width " + getWidth();
    }

}
