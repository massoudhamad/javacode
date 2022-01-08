public class BITACylinder extends BITACircle {
    private double height;
    public BITACylinder()
    {
        super();
        this.height=1.0;
    }    
    public BITACylinder(double height)
    {
        super();
        this.height=height;
    }
    public BITACylinder(double height,double radius)
    {
        super(radius);
        this.height=height;
    }
    public BITACylinder(double height,double radius,String color)
    {
        super(radius, color);
        this.height=height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "BITACylinder [height=" + height + "]";
    }
    public double getVolume()
    {
        return super.getArea()*height;
    }
    

}
