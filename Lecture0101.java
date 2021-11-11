import java.util.Scanner;
public class Lecture0101 {

    public static void main(String [] args)
    {
        /*
        
        Variable and Data Types

        int x;
        long y;
        byte p;
        short r;

        float,double - decimal number
        char 'A'
        boolean true/false

        String    
        */

        /* int x;
        x=5;
        System.out.println(x);
        char p = 'A';
        System.out.println(p); */

        /*
        Operators
        1. Arithmetic Operator
        2. Relational Operator
        3. Logical Operator
        4. Assignment Operator
        5. Ternary Operator

        1. AO=> +,-,*,/,%,^

        Input and Output
        output 
        print,println,printf
         */

         //System.out.println("This is ZIFA");
         //System.out.println("This is Chwaka");

         //Scanner,BufferedReader, ConsoleReader
         //Scanner

         Scanner input = new Scanner(System.in);
         /**
          * int-nextInt()
          float - nextFloat()
          double - nextDouble()
          String - nextLine()
          char - nextLine().charAt(0)
          */

          System.out.println("Please enter your name: ");
          String name = input.nextLine();
          System.out.println("How old are you? ");
          int age = input.nextInt();
          System.out.println("My name is: "+name+" and I am "+age+" years old");

    }
    
}
