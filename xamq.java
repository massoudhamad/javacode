import java.util.Scanner;
public class ConvertDistance {
public static void main(String[] args) {
double m;
Scanner keyboard = new Scanner(System.in)
System.out.println("To convert from miles to kilometers:");
System.out.println("Enter a distance followed by 'M' or 'm'");
System.out.println(" or");
System.out.println("To convert from kilometers to miles:");
System.out.println("Enter a distance followed by 'K' or 'k'")
String userInput = new String(keyboard.nextLine());
userInput = userInput.tolowerCase();
userInput = userInput.replaceAll(" ", "");
if (userInput.indexOf("m") != -1) {
userInput = userInput.replaceAll("k", "");
m = Double.parseDouble(userInput);
System.out.println(m)
k = (m * 1.6);
System.out.println(m + " miles is equal to " + k + " kilometers");
} else if (userInput.indexOf("k") != -1) {
userInput = userInput.replaceAll("m", "");
k = Double.parseDouble(userInput);
m = (k/1.6)
System.out.println(k +" kilometers is equal to " + m + " miles");
} else {
System.out.println("Invalid input");
System.exit(-1);
} // end of if
System.exit(0);
}
}