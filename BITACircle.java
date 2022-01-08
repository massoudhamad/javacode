public class BITACircle {
    private double radius;
    private String color;
    public BITACircle()
    {
        this.radius=1.0;
        this.color="red";
    }
    public BITACircle(double radius)
    {
        this.radius=radius;
        this.color="red";
    }
    public BITACircle(double radius,String color)
    {
        this.radius=radius;
        this.color=color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "BITACircle [color=" + color + ", radius=" + radius + "]";
    }
    public double getArea()
    {
        return Math.PI*radius*radius;
    }

    
    

    
}
