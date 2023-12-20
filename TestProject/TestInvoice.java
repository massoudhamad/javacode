
/**
 * Write a description of class TestInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestInvoice
{
    public static void main(String[] args)
    {
        Invoice inv = new Invoice("CL001","This is brake for lhs",40,0);
        System.out.println();
        System.out.println("Total Invoice amount is:"+inv.getInvoiceAmount());
    }
}
