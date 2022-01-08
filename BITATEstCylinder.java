public class BITATEstCylinder {
    public static void main(String [] args)
    {
        BITACylinder cy = new BITACylinder(4.5,2.0,"white");
        System.out.println(cy.getRadius()+" "+cy.getColor()+" "+cy.getHeight()
        );

        System.out.println(cy.getArea());
        System.out.println(cy.getVolume());
    }
    
}
