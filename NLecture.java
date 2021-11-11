import java.util.Scanner;
public class NLecture {

    public static void main(String [] args)
    {
       /*  int a;
        a=5;
        float b= 2.5f;
        long c = 3l;
        System.out.println("The value of a is: "+a);   
        System.out.println(b);
        System.out.println(c);
        char d = 'A';
        System.out.println(d); */

        //String
        /* String name = "Omar Ali";
        System.out.println(name); */

        //Operators
        /**
         * 1. Arithmetic Operator (+,-,*,/,%)
         * 2. Relational Operator (>,<,<=,>=,==,!=)
         * 3. Logical Operator (&&-AND,||-OR ,!-NOT)
         * 4. Assignment Operator
         * 5. Ternary Operator
         * 
         */

         int x=5;
         int y =7;
         int p=2;
         int q=1;
         /* System.out.println(x+y);
         System.out.println(x-y);
         System.out.println(x*y);
         System.out.println(x/y);
         System.out.println(x%y); */

         /* System.out.println(x>y); //false
         System.out.println(x<y); //true
         System.out.println(x>=y); //false
         System.out.println(x<=y); //true
         System.out.println(x==y); //false
         System.out.println(x!=y);//true */

        /*  System.out.println((x>y) && (p>q)); //false
         System.out.println((x<y) && (p>q)); //true
         System.out.println(!(x<y) || (p<q)); //false */

         /* int a = 5; //assignment operator
         int a == 5; // rational operator */

         /**
          * Input and Output
          */
          /* System.out.println("Hello ZNZ");
          System.out.println("Hello Computer Programming"); */

          /**
           * Scanner,BufferedReader,ConsoleReader
           * 
           */

           Scanner input = new Scanner(System.in);
           System.out.println("Enter your name: ");
           String name = input.nextLine();
           

           System.out.println("Enter your age: ");
           int age = input.nextInt();

           System.out.println("Your name is "+name+" and you are "+age+" years old");

           System.out.println("Enter your best letter: ");
           input.nextLine();
           char letter = input.nextLine().charAt(0);
           System.out.println("Your lovely character is: "+ letter);





    }

}
