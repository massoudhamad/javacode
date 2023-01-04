class RectangleLecture {

    private int length;
    private int width;

    public double getArea()
    {
        return length*width;
    }
    public double getPerimeter()
    {
        return 2*(length+width);
    }
}

public class RectangleDemo
{
    public static void main(String [] args)
    {
        RectangleLecture rect = new RectangleLecture();
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
    }
}
