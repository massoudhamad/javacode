
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    private String firstName;
    private String lastName;
    private int salary;
    
    public Employee(String firstName,String lastName,int salary)
    {
        //this.firstName=firstName;
        setFirstName(firstName);
        //this.lastName=lastName;
        setLastName(lastName);
        setSalary(salary);
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
        
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setSalary(int salary)
    {
        if(salary<0){
            salary=0;
        }else{ 
            this.salary=salary;
        }
    }
    public int getSalary()
    {
        return salary;
    }
    
    
    public int calculateAnnualSalary()
    {
        return salary*12;
    }
    public double calculate10Raise()
    {
        return ((salary*10)/100)+salary;
    }
}
