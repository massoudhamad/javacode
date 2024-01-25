public class CircleTest {

    public static void main(String[] args) {
        Circle c = new Circle(4);
        Cylinder cy = new Cylinder(3, 5);

        System.out.println(cy.getArea());
        System.out.println(c.getArea());
        System.out.println(cy.getVolume());

        Circle cc = new Cylinder(4, 6);

        Circle ccc = (Cylinder)cc;

        System.out.println(cc.getArea());
        System.out.println(cc.getVolume());// error

    }

}
