import java.util.Scanner;
public class Selection
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int marks=input.nextInt();
        if(marks>=70)
        {
            System.out.println("A");
        }else if(marks>=60)
        {
            System.out.println("B+");
        }else if(marks>=50)
        {
            System.out.println("B");
        }
        else if(marks>=40)
        {
            System.out.println("C");
        }
        else 
        {
            System.out.println("Fail");
        }
    }
}