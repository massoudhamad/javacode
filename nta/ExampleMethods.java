public class ExampleMethods {
    public static void main(String[] args)
    {
        System.out.println(sum(2,3));
        System.out.println(sumThree(2,4,5));
        displayName();
    }

    static int sum(int a,int b)
    {
        return a+b;
    }
    static int sumThree(int a,int b,int c)
    {
        return sum(a,b)+c;
    }

    static void displayName()
    {
        System.out.println("Welcome to SUZA");
    }
}
