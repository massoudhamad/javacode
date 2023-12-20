
/**
 * Write a description of class ChangeMoney here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ChangeMoney
{
    public static void main(String [] args)
    {
        //input Scanner class
        Scanner oku = new Scanner(System.in);
        
        final int FIRST_CLASS_STAMP_PRICE =47;
        int lira;
        int firstClassStamps;
        int change;
        
        System.out.print("Enter number of lira  coins: ");
        lira=oku.nextInt();
        
        /*
        int = nextInt()
        float = nextFloat()
        double = nextDouble()
        char = nextLine();
        */
        firstClassStamps = 100*lira/FIRST_CLASS_STAMP_PRICE;
        change = 100*lira-firstClassStamps*FIRST_CLASS_STAMP_PRICE;
        
        System.out.printf("First Class Stamps: %6d%n",firstClassStamps);
        System.out.println("Change:"+change);
        
    }
}
