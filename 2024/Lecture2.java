import java.util.Scanner;

public class Lecture2 {
    public static void main(String[] args) {

        /*
         * if statememt
         * if-else statement
         * if-else-if statement
         * switch statement
         * Logical operators
         * printf vs println
         * 
         * 
         * 
         * 
         * 
         * if (condition) {
         * // code block
         * }
         * 
         * 
         */
        int x = 4;
        if (x > 5) {
            System.out.println(x + " is greater than 5");
        } else {
            System.out.println(x + " is less than or equal to 5");
        }
        /*
         * more than one condition
         * if (condition1) {
         * // code block
         * } else if (condition2) {
         * // code block
         * } else {
         * // code block
         * }
         */
        int y = 5;
        if (y > 5) {
            System.out.println(y + " is greater than 5");
        } else if (y < 5) {
            System.out.println(y + " is less than 5");
        } else {
            System.out.println(y + " is equal to 5");
        }

        /*
         * switch statement
         * switch (expression) {
         * case value1:
         * // code block
         * break;
         * case value2:
         * // code block
         * break;
         * default:
         * // code block
         * }
         */
        int z = 5;
        switch (z) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        switch (ch) {
            case 'a':
                System.out.println("You entered 'a'");
                break;
            case 'b':
                System.out.println("You entered 'b'");
                break;
            case 'c':
                System.out.println("You entered 'c'");
                break;
            default:
                System.out.println("You entered another character");
        }
        scanner.close();

        /*
         * Boolean operators/expresions
         * && - logical AND
         * || - logical OR
         * ! - logical NOT
         * greater than,
         * less than,
         * greater than or equal to,
         * less than or equal to,
         * equal to,
         * not equal to
         * int x=5;y=6;
         * x>y - false
         * x<y - true
         * x>=y - false
         * x<=y - true
         * x==y - false
         * x!=y - true
         * $$ - logical AND
         * eg int x=5,y=6;
         * if (x>0 && y>0) {
         * // code block
         * }
         * 
         */
        

    }

}
