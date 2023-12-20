
/**
 * Write a description of class ExampleDecision here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ExampleDecision
{
    /*
       1. Sequence
           */
          public static void main(String [] args)
          {
              Scanner input = new Scanner(System.in);
              //int price;
              System.out.print("Enter your price: ");
              double price=input.nextDouble(); //int-nextInt(), double-nextDouble(), 
              double discounted_amount;
              if(price<128)
              {
                  discounted_amount=0.08*price; //8 percent 
              }
              else
              {
                  discounted_amount=0.16*price; //16 percent
              }
              double discounted_price = price-discounted_amount;
              System.out.println("Discount Amount is: "+discounted_amount);
              System.out.println("Discounted Price is: "+discounted_price);
              
              
              /*
              

              double ritcher=0.0;
              String damageDescription = "";
              
              sop("Enter Ritcher ....");
              input.nextDouble();
              if(ritcher>=8.0)
              damageDescription = "Most Structure fall";
              esle if(ritcher>7.0)
              damageDescription = "Many building destroyed";
              else 
              damageDescription = "No Destruction";
              
              sop("Ritcher Strength"+ritcher+"Damage Description"+damageDescription);
              */
              
              
              
              
          }
          /*
       2. Selection
           Path to follow; condition expression - arithmetic {+,-,*,/,%-Modulus; Remainder}
           6%4=2
           ii Relational Expression >,<,>=,<=,==,!= {True,False}
           boolean expression - True/False
           Eg. a=3, b=2
           a>b  True
           a<b False
           a>=b True
           a<=b False
           a==b False
           a!=b  True
           
           Syntax
           if, 
           if..else
           if ...esleif ...else
           
           passmark=50.
           
           if(passmark>=50){
               sop("pass");
            }
            else{
                sop("fail");
            }
            
           switch()
           
           
       3. Repetion
       
    */
}
