import java.util.Scanner;
class Lecture01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] temperature = new double[7];
        for(int i=0;i<temperature.length;i++)
        {
            System.out.print("Enter temperature for day"+(i+1)+": ");
            temperature[i] = input.nextDouble();
        }

        double sum=0;
        for(int j=0;j<temperature.length;j++)
        {
            System.out.println("Temprature for day"+(j+1)+" is:"+temperature[j]);
            sum+=temperature[j];
        }
        System.out.println("The Summation of Temperature in 7 days is: "+sum);
    }
}