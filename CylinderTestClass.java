public class CylinderTestClass {

    public static void main(String [] args)
    {
        Cylinder cy = new Cylinder();

        System.out.println(cy.getRadius()+"-"+cy.getColor()+"-"+cy.getHeight()+"-"+cy.getArea()+"-"+cy.getVolume());

        Cylinder cy1 = new Cylinder(2.0,4.0);

        System.out.println(cy1.getRadius()+"-"+cy1.getColor()+"-"+cy1.getHeight()+"-"+cy1.getArea()+"-"+cy1.getVolume());


    }
    
}
