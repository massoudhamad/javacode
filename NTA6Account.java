import javax.swing.plaf.synth.SynthScrollPaneUI;

public class NTA6Account
{
    private int accountBalance;
    public NTA6Account(int initialBalance)
    {
        if(initialBalance > 0)
        {
            accountBalance=initialBalance;
        }else {
            accountBalance=0;
            System.out.println("Invalid initial balance");
        }
    }

    public int credit(int amount)
    {
        return accountBalance+=amount;
    }
    public int debit(int amount)
    {
        if(amount>accountBalance)
        {
            System.out.println("Debit amount exceeded account balance");
            return accountBalance;
        }
        else
        {
            return accountBalance-=amount;
        }
    }
    public int getBalance()
    {
        return accountBalance;
    }

    public static void main(String [] args)
    {
        NTA6Account acc = new NTA6Account(5000);
        System.out.println(acc.getBalance());
        acc.credit(40000);
        System.out.println(acc.getBalance());
        acc.debit(5000);
        System.out.println(acc.getBalance());
        acc.debit(60000);
        System.out.println(acc.getBalance());
    }
}