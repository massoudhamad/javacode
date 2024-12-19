public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(25, -1);
        System.out.println(rect.getLength());
        System.out.println(rect.getWidth());
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());

        rect.setLength(15);
        rect.setWidth(12);

        System.out.println(rect.getLength());
        System.out.println(rect.getWidth());
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());

    }
}
