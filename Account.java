public class Account {

    // Balance
    private double balance;

    // Constructor
    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean deposit(double amt) {
        if (amt <= 0) {
            return false;
        }

        this.balance += amt;
        return true;
    }

    public boolean withdraw(double amt) {
//        cannot withdraw negative
//        cannot withdraw 0
//        cannot withdraw > this.balance
        if (amt <= 0 || amt > this.balance) {
            return false;
        }

        this.balance -= amt;
        return true;
    }
}
