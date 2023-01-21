public class TestPoint2DPoint3D {
    public static void main(String[] args) {
        Point2D p2d = new Point2D();
        System.out.println(p2d.toString());// x=0,y=0
        Point2D pp2d = new Point2D(2, 5);
        System.out.println(pp2d.toString());

        Point3D p3d = new Point3D();
        System.out.println(p3d.toString());
        Point3D pp3d = new Point3D(3, 4, 5);
        System.out.println(pp3d.toString());
    }
}
