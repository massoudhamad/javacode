import java.util.Scanner;
public class HassanNuru {
    public static void main(String[] args)
    {
        Scanner nuru = new Scanner(System.in);
        int[] score = new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter your score for student number: "+(i+1));
            score[i]=nuru.nextInt();
        }
        //display
        System.out.println("-----------------------------------------------------------------------");
        for(int x:score)
        {
            if(x%2==0)
            continue;
            System.out.println(x);
            
        }
    }
    
}
