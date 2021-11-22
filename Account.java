public class Account {
    public Account(int initialBalance)
    {
        if(initialBalance>=0)
            accountBalance=initialBalance;
        else{
            accountBalance=0;
        }
    }

    public double credit(int amount)
    {
        return accountBalance+=amount;
    }

    public double debit(int amount)
    {
        if(amount < accountBalance)
            return accountBalance-=amount;
        else
            return accountBalance;
    }

    public int getBalance()
    {
        return accountBalance;
    }
    private int accountBalance;
    
}
