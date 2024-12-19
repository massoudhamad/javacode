public class Account {
    private int accountBalance;

    Account(int initialBalance) {
        if (initialBalance > 0) {
            accountBalance = initialBalance;
        } else {
            accountBalance = 0;
            System.out.println("Initial balance was invalid.");
        }
    }

    public double credit(int amount) {
        accountBalance = accountBalance + amount;
        return accountBalance;
    }

    public double debit(int amount) {
        if (amount > accountBalance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            accountBalance = accountBalance - amount;
        }
        return accountBalance;
    }

    public int getBalance() {
        return accountBalance;
    }
}
