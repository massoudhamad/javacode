
/**
 * Write a description of class Author here.
 *
 * @author massoudhamad
 * @version (a version number or a date)
 */
public class Author
{
    private String name;
    private String email;
    private char gender;
    
    public Author(String name,String email,char gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getEmail()
    {
        return email;
    }
    
    public void setGender(char gender)
    {
        this.gender=gender;
    }
    public char getGender()
    {
        return gender;
    }
    
    public String toString()
    {
        return name + " (" + gender + ") at " + email;
    }
    
}
