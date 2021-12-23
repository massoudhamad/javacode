import java.util.Scanner;
public class BRectangle {
    private int length;
    private int width;

    //methods
    public BRectangle()
    {
        length=5;
        width=2;
    }

    public BRectangle(int l,int w)
    {
        length=l;
        width=w;
    } 

    public int perimeter()
    {
        return 2*(length+width);
    }

    public int area()
    {
        return length*width;
    }

    public static void main(String [] args)
    {
        BRectangle rect = new BRectangle();
        System.out.println(rect.length);
        System.out.println(rect.width);
        System.out.println(rect.perimeter());
        System.out.println(rect.area());


        BRectangle rect1=new BRectangle(3,4);
        System.out.println("----with user values---");
        System.out.println(rect1.length);
        System.out.println(rect1.width);
        System.out.println(rect1.perimeter());
        System.out.println(rect1.area());

        Scanner input = new Scanner(System.in);
        int length=input.nextInt();
        int width=input.nextInt();

        BRectangle rect2=new BRectangle(length,width);
        System.out.println("----with user values---");
        System.out.println(rect2.length);
        System.out.println(rect2.width);
        System.out.println(rect2.perimeter());
        System.out.println(rect2.area());
    }

}
