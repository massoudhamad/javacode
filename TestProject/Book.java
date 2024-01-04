
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private String name;
    private Author  author;
    private int quantity;
    private double price;
    
    public Book(String name,Author author,int quantity,double price)
    {
        this.name=name;
        this.author=author;
        this.quantity=quantity;
        this.price=price;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    
    public void setAuthor(Author author)
    {
        this.author=author;
    }
    public Author getAuthor()
    {
        return author;
    }
    
    public void setQuantity(int qty)
    {
        quantity=qty;
    }
    public int getQuantity()
    {
        return quantity;
    }
    
    public void setPrice(double price)
    {
        this.price=price;
    }
    public double getPrice()
    {
        return price;
    }
    
    public String toString()
    {
        return name + " by " + author +" with "+ quantity+" copies "+ " and each copy cost "+price;  // author.toString()
    }
    
}
