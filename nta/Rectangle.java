public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    public double getArea() {
        return length * width;

    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2, 3);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());

        Rectangle rect2 = new Rectangle(50, 40);
        System.out.println(rect2.getArea());
        System.out.println(rect2.getPerimeter());
    }
}