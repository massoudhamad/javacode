import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // This is a comment
        /*
         * This is a multi-line comment
         * that spans multiple lines
         * and is used to describe the code
         * 
         */
        // Escape sequences
        // \n - newline
        // \t - tab
        // \" - double quote
        // \\ - backslash
        System.out.println("Hello, World!\n");
        System.out.println("Hello, World!\t");
        System.out.println("Hello, World!\"");
        System.out.println("Hello, World!\\");

        /*
         * Identifiers
         * class names, method names, variable names
         * variable names are case-sensitive
         * eg. myVariable, MyVariable, MYVARIABLE
         * double myVariable = 3.14;
         * int MyVariable = 42;
         * char MYVARIABLE = 'A';
         * String myVariable = "Hello";
         * Data types
         * int - integer
         * double - floating point number
         * char - single character
         * String - sequence of characters
         * boolean - true or false
         * primitive data types - int, double, char, boolean
         * reference data types - String
         * Numeric data types
         * byte - 8-bit signed integer
         * short - 16-bit signed integer
         * int - 32-bit signed integer
         * long - 64-bit signed integer
         * float - 32-bit floating point number
         * double - 64-bit floating point number
         * eg int myInt = 42;
         * eg double myDouble = 3.14;
         * eg char myChar = 'A';
         * eg String myString = "Hello";
         * eg boolean myBoolean = true;
         * eg with byte, short, long, float
         * eg byte myByte = 127;
         * eg short myShort = 32767;
         * eg long myLong = 9223372036854775807L;
         * eg float myFloat = 3.14f;
         * eg double myDouble = 3.14;
         * 
         * eg of assignment and initialization
         */
        int month, days;
        month = 2;
        days = 28;
        System.out.println("Month " + month + " has " + days + " days.");

        /*
         * Constants
         * final keyword
         * final int DAYS_IN_FEBRUARY = 28;
         * 
         */
        /*
         * Arithmetic operators
         * + - addition
         * - - subtraction
         * * - multiplication
         * / - division
         * % - modulus
         * Integer division
         * int x = 5 / 2; // x = 2
         * Operator precedence
         * ()
         * *, /, %
         * +, -
         * eg int x = 5 + 2 * 3; // x = 11
         * eg int x = (5 + 2) * 3; // x = 21
         * combined assignment operators
         * +=, -=, *=, /=, %=
         * eg int x = 5;
         * x += 3; // x = 8
         * x -= 3; // x = 5
         * x *= 3; // x = 15
         * x /= 3; // x = 5
         * x %= 3; // x = 2
         * Increment and decrement operators
         * ++, --
         * eg int x = 5;
         * x++; // x = 6
         * x--; // x = 5
         * eg int x = 5;
         * int y = x++; // x = 6, y = 5
         * eg int x = 5;
         * int y = ++x; // x = 6, y = 6
         * preincrement and postincrement
         * eg int x = 5;
         * int y = x++; // x = 6, y = 5
         * eg int x = 5;
         * 
         * 
         * Reference data types
         * String
         * String myString = "Hello";
         * String message = new String("Hello");
         * String methods
         * length() - returns the length of the string
         */
        String message = "Hello";
        System.out.println(message.length());
        /*
         * charAt() - returns the character at the specified index
         */
        System.out.println(message.charAt(0));
        /*
         * substring() - returns a substring of the string
         */
        System.out.println(message.substring(0, 3));
        /*
         * equals() - compares two strings
         */
        System.out.println(message.equals("Hello"));
        /*
         * equalsIgnoreCase() - compares two strings ignoring case
         */
        System.out.println(message.equalsIgnoreCase("hello"));
        /*
         * compareTo() - compares two strings
         */
        System.out.println(message.compareTo("Hello"));
        /*
         * compareToIgnoreCase() - compares two strings ignoring case
         */
        System.out.println(message.compareToIgnoreCase("hello"));
        /*
         * toUpperCase() - converts the string to uppercase
         */
        System.out.println(message.toUpperCase());
        /*
         * toLowerCase() - converts the string to lowercase
         */
        System.out.println(message.toLowerCase());
        /*
         * trim() - removes leading and trailing whitespace
         */
        System.out.println(message.trim());
        /*
         * indexOf() - returns the index of the first occurrence of a character
         */
        System.out.println(message.indexOf('l'));
        /*
         * lastIndexOf() - returns the index of the last occurrence of a character
         */
        System.out.println(message.lastIndexOf('l'));
        /*
         * startsWith() - returns true if the string starts with the specified prefix
         */
        System.out.println(message.startsWith("He"));
        /*
         * endsWith() - returns true if the string ends with the specified suffix
         */
        System.out.println(message.endsWith("lo"));
        /*
         * contains() - returns true if the string contains the specified substring
         */
        System.out.println(message.contains("el"));
        /*
         * replace() - replaces all occurrences of a character with another character
         */
        System.out.println(message.replace('l', 'L'));
        /*
         * replaceAll() - replaces all occurrences of a substring with another substring
         */
        System.out.println(message.replaceAll("l", "L"));
        /**
         * Read Input from the Console
         * Scanner class
         * import java.util.Scanner;
         * Scanner scanner = new Scanner(System.in);
         * int x = scanner.nextInt();
         * double y = scanner.nextDouble();
         * String z = scanner.nextLine();
         * 
         */
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a your name: ");
        input = scanner.nextLine();
        System.out.println("Hello, " + input + "!");

        // eg of numbers
        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.println("Hello " + input + ", you are " + age + " years old.");

    }
}
