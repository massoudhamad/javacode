
/**
 * Write a description of class BookAuthorTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BookAuthorTest
{
    public static void main(String args[])
    {
        Author auth = new Author("Massoud","massoudhamad@suza.ac.tz",'M');
        Book bk = new Book("Java Programming",auth,20,3000.0);
        
        System.out.println(auth.toString());
        System.out.println(bk.toString());
        
        
    }
}
