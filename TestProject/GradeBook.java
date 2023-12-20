public class GradeBook
{
    public GradeBook()
    {}
    
    public void displayMessage()
    {
        System.out.println("Welcome to GradeBook");
    }
    
    public static void main(String [] args)
    {
        GradeBook gb = new GradeBook();
        gb.displayMessage();
    }
}
