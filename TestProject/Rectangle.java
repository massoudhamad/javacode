public class Rectangle
{
    private double length;
    private double width;
    
    public Rectangle()
    {
        length=1.0;
        width=1.0;
    }

    public void setLength(double length)
    {
        if(length>0.0 && length<20.0)
            this.length=length;
        else 
            this.length=1.0;
    }
    public double getLength()
    {
        return length;
    }
    public void setWidth(double width)
    {
        if(width>0.0 && width<20.0)
            this.width=width;
        else 
            this.width=1.0;
    }
    public double getWidth()
    {
        return width;
    }
    
    public double calculateArea()
    {
        return length*width;
    }
    public double calculatePerimeter()
    {
        return 0.5*(length+width);
    }
    
    public static void main(String [] args)
    {
        Rectangle rect = new Rectangle();
        System.out.println(rect.getLength());
        System.out.println(rect.getWidth());
        System.out.println("Calculate Area is: "+ rect.calculateArea());
        System.out.println("Calculate Perimeter is: "+rect.calculatePerimeter());
        rect.setLength(35.5);
        rect.setWidth(19.0);
        System.out.println(rect.getLength());
        System.out.println(rect.getWidth());
        System.out.println("Calculate Area is: "+ rect.calculateArea());
        System.out.println("Calculate Perimeter is: "+rect.calculatePerimeter());
    }
}
