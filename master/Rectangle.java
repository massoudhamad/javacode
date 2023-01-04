public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        if (length >= 0.0 && length <= 20.0)
            this.length = length;
        else
            length = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width >= 0.0 && width <= 20.0)
            this.width = width;
        else
            width = 1.0;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        // Rectangle rect1 = new Rectangle(4.5, 3.5);

        /*
         * System.out.println(rect.getArea());
         * System.out.println(rect1.getArea());
         * System.out.println(rect.getPerimeter());
         * System.out.println(rect1.getPerimeter());
         */

        rect.setLength(15.0);
        System.out.println(rect.getLength());
        rect.setWidth(10.0);
        System.out.println(rect.getWidth());
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
    }

}