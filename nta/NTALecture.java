import java.util.Scanner;
public class NTALecture {

    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        /* int marks;
        System.out.println("Enter your marks");
        marks=input.nextInt(); */
        /* if(marks>=50)
            System.out.println("Pass");
        else
            System.out.println("Fail");   */  
        /* if(marks>=70)
            System.out.println("A");
        else if(marks>=60)
            System.out.println("B+");
        else if(marks>=50)
            System.out.println("B");
        else if(marks>=40)
            System.out.println("C");
        else 
            System.out.println("F"); */

        /* int day = input.nextInt();
        switch(day)
        {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wed");
            break;
            default:
            System.out.println("Invalid day");
        } */

        int a,b,c;
        System.out.println("Enter value of a: ");
        a=input.nextInt();
        System.out.println("Enter value of b: ");
        b=input.nextInt();
        System.out.println("Enter value of c: ");
        c=input.nextInt();
        if(a>b)
        {
            if(a>c)
                System.out.println(a+" is a maximum number");
            else 
                System.out.println(c+" is a maximum number");
        }
        else 
        {
            if(b>c)
                System.out.println(b+" is a maximum number");
            else 
                System.out.println(c+" is a maximum number");
        }
            
        
    }
    
}
