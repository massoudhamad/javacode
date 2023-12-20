
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice
{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private int price;
    
    public Invoice(String partNumber,String partDescription,int quantity,int price)
    {
        this.partNumber=partNumber;
        this.partDescription=partDescription;
        this.quantity=quantity;
        this.price=price;
    }
    
    public void setPartNumber(String partNumber)
    {
        this.partNumber=partNumber;
    }
    public String getPartNumber()
    {
        return partNumber;
    }
    
    
    public int getInvoiceAmount(){
        if(quantity<0)
             return 0;
        else if(price<0)
            return 0;
        else 
            return quantity*price;
    }
}
