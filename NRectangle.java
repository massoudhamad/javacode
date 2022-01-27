public class NRectangle extends NShape {
    public NRectangle(int l,int w)
    {
        super(l,w);
    }
    public double getArea()
    {
        return getLength()*getWidth();
    }
    public double getPerimeter()
    {
        return 2*(getLength()+getWidth());
    }
}
