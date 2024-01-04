
/**
 * Write a description of class EmpoyeeTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EmpoyeeTest
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        for(int i=1;i<=10;i++)
        {
            System.out.println("Enter your firstname: ");
            String firstName=input.nextLine();
            
            System.out.println("Enter your firstname: ");
            String lastName=input.nextLine();
            
            System.out.println("Enter your firstname: ");
            String salary=input.nextLine();
            
            Employee emp = new Employee(firstName + i, lastName + i,i);
            System.out.println("Employee " + i + " Details:");
            System.out.println("Name: " + emp.getFirstName() + " " + emp.getLastName());
            System.out.println("Salary: $" + emp.getSalary());
            System.out.println();
        }
        
    }
}

        /* System.out.println(emp.getFirstName()+" "+emp.getLastName());
        System.out.println("Annual Salary for Employee 1: "+emp.calculateAnnualSalary());
        System.out.println("Annual Salary for Employee 2: "+emp.calculateAnnualSalary());
        
        emp.setFirstName("Ummul");
        emp.setLastName("Suleiman");
        emp.setSalary(50000);
        
        emp.setFirstName("Salma");
        emp.setLastName("Suleiman");
        emp.setSalary(60000);
        
        System.out.println(emp1.getFirstName()+" "+emp1.getLastName());
        System.out.println("10% Raise Annual Salary for Employee 1: "+emp1.calculate10Raise());
        System.out.println("10% Raise Annual Salary for Employee 2: "+emp1.calculate10Raise());
        
        
    }
}*/
