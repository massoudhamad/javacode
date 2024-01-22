
/**
 * Write a description of class Cylinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cylinder extends Circle
{
   private double height;
   public Cylinder(double height, double radius) {
      super(radius);
      this.height = height;
   }
   /** Returns the height */
   public double getHeight() {
      return this.height;
   }
   /** Returns the volume of this cylinder */
   public double getVolume()
   {
       return super.getArea()*height;
   }
   
   @Override
   public double getArea()
   {
        return 2.0 * Math.PI * getRadius() * height;
   }
}
