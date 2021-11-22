public class AccountTest {

    public static void main(String [] args)
    {
        Account acc = new Account(500);
        System.out.println(acc.getBalance());

        acc.credit(50000);
        System.out.println(acc.getBalance());

        acc.debit(20000);
        System.out.println(acc.getBalance());

    }
    
}
