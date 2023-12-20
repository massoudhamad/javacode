
/**
 * Write a description of class FinaLGradeScore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class FinaLGradeScore
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        final int EXAMWEIGHT = 70;
        final int LABWEIGHT = 20;
        final int HWWEIGHT = 10;
        
        double examScore;
        double labScore;
        double hwScore;
        double finalGrade;
        
        System.out.print("Enter your exam Score: ");
        examScore=input.nextDouble();
        System.out.print("Enter your lab score: ");
        labScore=input.nextDouble();
        System.out.print("Enter your homework score: ");
        hwScore=input.nextDouble();
        System.out.println();
        examScore=examScore*(EXAMWEIGHT/100.0);
        labScore=labScore*(LABWEIGHT/100.0);
        hwScore=hwScore*(HWWEIGHT/100.0);
        finalGrade=examScore+labScore+hwScore;
        System.out.println("Your final grade is "+finalGrade);
        
        
            
        
    }
}
