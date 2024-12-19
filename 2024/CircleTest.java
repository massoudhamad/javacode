public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(); // default constructor
        System.out.println("The Area of Circle is " + c1.getArea());
        Circle c2 = new Circle(2.0); // overloaded constructor
        System.out.println("The Area of Circle2 is " + c2.getArea());
        Circle c3 = new Circle(3.0, "blue"); // overloaded constructor
        System.out.println("The Area of Circle3 is " + c3.getArea());

    }
}
