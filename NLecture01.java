import java.util.Scanner;
public class NLecture01 {
    //control structure
    public static void main(String[] args)
    {
        /* int marks = 30;
        if(marks>=50)
        {
            System.out.println("Pass");
        } */
        Scanner input = new Scanner(System.in);
        /* System.out.print("Enter your marks: ");
        int marks= input.nextInt();

        if(marks>=70)
            System.out.println("A\nExcellent");
        else if(marks>=60)
            System.out.println("B+\nVery Good");
        else if(marks>=50)
            System.out.println("B\nGood");
        else if(marks>=40)
            System.out.println("C\nPass");
        else if(marks>=35)
            System.out.println("D\nPoor");
        else 
            System.out.println("F\nFail\nLazy\nYou are not part of us"); */

            //switch

        /* System.out.println("Please enter your number to print out a day");
        int day=input.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                System.out.println("Start of the week");
                System.out.println("ZNZ");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                System.out.println("Kendwa Rocks");
                break;
        } */


        //Repetition
        /* for(int i=1;i<=100;i++)
        {
            if(i%2==0)
                System.out.println(i);
        } */

        //while loop
        //infinite loop
        /* boolean flag = true;
        while(flag)
        {
            System.out.println("Welcome to SOB Ndondo Cup");
        } */

        

        //finite loop
        /* 
        pre test loop
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        } */

        //post test loop
        /* int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<=10); */

        //break and continue
        /* for(int i=1;i<=10;i++)
        {
            if(i==5)
                break;
            if(i==5)
                continue;
            else 
                System.out.println(i);

        } */

        //nested if and nested loop

        /* int a,b,c;
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();

        if(a>b)
        {
            if(a>c)
                System.out.println(a+" is maximum number");
            else
                System.out.println(c+" is maximum number");
        }
        else 
        {
            if(b>c)
                System.out.println(b+" is maximum number");
            else 
                System.out.println(c+" is maximum number");
        }
 */
        //nested loop
        /* for(int h=0;h<=23;h++)
        {
            for(int m=0;m<=59;m++)
            {
                for(int s=0;s<=59;s++)
                {
                    System.out.println(h+":"+m+":"+s);
                }
            }
        } */
        //calling function
        /* displayMessage();

        System.out.println("Summation of two Numbers is: "+calculateSum(4, 6)); */

        /* System.out.println(first_if_funct(-1,5)); */

        //array

        /* int[] age = {3,4,6,8,10};
        
        System.out.println(age[0]);//3
        System.out.println(age[3]);//8
        System.out.println(age[4]);//10
        System.out.println(age[5]);//error */

        int[] a=new int[10];
        for(int i=0;i<=9;i++)
        {
            a[i]=input.nextInt();
        }

        int sum=0;
        for(int j=0;j<=9;j++)
        {
            System.out.println(a[j]);
            sum+=a[j];
        }
        System.out.println("Sum is:"+sum);
        System.out.println("Average "+sum/10);

        


        
    }

    //functions
   /*  static void displayMessage()
    {
        System.out.println("Welcome to SoB");
    }

    static int calculateSum(int n1,int n2)
    {
        return n1+n2;
    }

    static double firstFunction(int x,int y)
    {
        return ((y*y)/x+Math.sqrt(x)*y);
    }

    static double secondFunction(int x,int y)
    {
        return Math.pow((x+2),3)+y;
    }

    static double first_if_funct(int x,int y)
    {
        if(x>0)
            return firstFunction(x, y);
        else if(x<0)
            return secondFunction(x, y);
        else 
            return x;
    }
 */
}
