import java.util.Scanner;
public class BLecture02 {

    //control structure
    /**
     * Sequence
     * Selection
     * if, if---else,if elseif else,switch
     *if(condition){}
     * Repetition
     * 
     */

     public static void main(String [] args)
     {
         Scanner input = new Scanner(System.in);
         /* int marks = 40;
         if(marks >= 50){
            System.out.println("Pass");
         }else {
             System.out.println("Fail");
         } */

         /* System.out.print("Enter ur marks:");
         int marks=input.nextInt();
         if(marks>100 || marks<0)
         {
             System.out.println("Invalid Marks");
         }
        else 
        {
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
            System.out.println("F\nFail\nLazy");
        } */

        //switch

        /* System.out.print("Enter ur quiz score:");
         int quiz=input.nextInt();
         
         switch(quiz)
         {
             case 5:
                System.out.println("A");
                break;
            case 4:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 2:
                System.out.println("D");
                break;
            case 1:
                System.out.println("F");
                break;
            default:
                System.out.println("F");
                break;
         } */

         //Repetition
         //for loop
         /* for(int i=10;i>=1;i--)
         {
             System.out.println(i);
         } */

         //while loop
         /* boolean flag = true;

         while(flag)
         {
             System.out.println("Infinite loop");
         } */

         /* System.out.println(" == while == ");
         int i=11;
         while(i<=10)
         {
             System.out.println(i);
             i++;
         } 
         System.out.println(" == do while == ");
         int j = 11;
         do {
             System.out.println(j);
             j++;
         }while(j<=10); */

         //break and continue
         /* for(int i=0;i<=10;i++)
         {
             /* if(i==5)
                break;
             System.out.println(i); 

             if(i==5) continue;
             else 
                System.out.println(i);
         } */

         //initial, final,step value

         /* for(int i=2;i<=100;i=i+2)
         {
             System.out.println(i);
         } */

         /*for(int i=1;i<=100;i++)
         {
             if(i%2 == 0)
                System.out.println(i);
         }*/

         //nested loop
         /* System.out.println("Enter value of a,b,c");
         int a=input.nextInt();
         int b=input.nextInt();
         int c=input.nextInt();

         if(a>b){
             if(a>c)
                System.out.println(a+" is a maximum");
            else 
                System.out.println(c+" is a maximum");
         }
         else 
         {
             if(b>c)
                System.out.println(b+" is maximum");
            else 
                System.out.println(c+" is maximum");
         }
 */

         /* for(int h=0;h<=23;h++)
         {
             for(int m=0;m<=59;m++)
             {
                 for(int s=0;s<=59;s++)
                 {
                     System.out.println(h+":"+m+":"+s);
                 }
             }
         }
 */

         //functions and array

         

     }
    
}
