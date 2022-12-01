public class Rectangle
{
    private float length;
    private float width;

    public Rectangle()
    {
        length=1;
        width=1;
    }

    public Rectangle(float length,float width)
    {
        setLength(length);
        setWidth(width);
        /* this.length=length;
        this.width=width; */
    }

    public void setLength(float length)
    {
        if(length>=0.0 && length <=20.0)
            this.length=length;
        else 
            this.length=1;
    }
    public void setWidth(float width)
    {
        if(width>=0.0 && width <=20.0)
            this.width=width;
        else 
            this.width=1;
    }
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public double area()
    {
        return length*width;
    }

    public double perimeter()
    {
        return 2*(length+width);
    }


    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle();
        Rectangle rect2 = new Rectangle(40.0f,30.0f);

        System.out.println("Area of Rectangle(default): "+rect.area());
        System.out.println("Area of Rectangle: "+rect2.area());
        System.out.println("Perimeter of Rectangle: "+rect2.perimeter());
    }

}



