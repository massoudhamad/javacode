import java.util.Scanner;

class HelloMaster
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        /*
        Control Structure
        1. Sequence
        1. Selection
        2. Repetition
        

        //Selection
        if,if-else, if-else if-else,switch



        */
        /* int marks=55;
        if(marks>=85)
            System.out.println("A");
        else if(marks>=70)
            System.out.println("B+");
        else if(marks>=60)
            System.out.println("B");
        else if(marks>=50)
            System.out.println("C");
        else 
            System.out.println("F"); */

        int number= input.nextInt();
        switch(number){ //expression
            case 1:
            System.out.println("Monday");
            System.out.println("Blue Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            default:
            System.out.println("Weekend");
            break;
        }

        /*int a=14,b=5,c=8;
        if(a>b)
        {
            if(a>c)
                System.out.println(a+" is maximum");
            else 
                System.out.println(c+" is maximum");
        }
        else 
        {
            if(b>c)
                System.out.println(b+ " is maximum");
            else
                System.out.println(c+ " is maximum");   
        }


        output
        print(),println(),printf()
        input
        Scanner,BufferedReader,ConsoleReader
        */


        

        //int nextInt()
        //float nextFloat()
        //double nextDouble()
        //String nextLine()

        /* System.out.println("How old are you? ");
        int age;
        age=input.nextInt();
        System.out.println("I am " +age+" years old");
        input.nextLine();
        System.out.println("What is ur name? ");
        String name=input.nextLine();
        System.out.println("My name is: "+name); */

    }
}