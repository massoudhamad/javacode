public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(500000);
        Account account2 = new Account(100000);

        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());
        account1.credit(50000);
        account2.credit(10000);
        System.out.println("Account 1 balance after credit: " + account1.getBalance());
        System.out.println("Account 2 balance after credit: " + account2.getBalance());
        account1.debit(100000);
        account2.debit(50000);
        System.out.println("Account 1 balance after debit: " + account1.getBalance());
        System.out.println("Account 2 balance after debit: " + account2.getBalance());

        Account account3 = new Account(-100000);
        System.out.println("Account 3 balance: " + account3.getBalance());

    }

}
