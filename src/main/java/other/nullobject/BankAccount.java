package other.nullobject;

public class BankAccount {

    private Log log;
    private int balance;

    public BankAccount(Log log) {
        this.log = log;
        this.balance = 0;
    }

    public void deposit(int amount) {
        this.balance += amount;
        log.info("Rs." + amount + "/- is deposited in a bank account");
    }

    public void withdraw(int amount) {
        if (this.balance - amount >= 0) {
            this.balance -= amount;
            log.info("Rs." + amount + "/- is withdrew from a bank account. Available balance is Rs." + this.balance + "/-.");
        } else {
            log.warn("Balance is a low in a bank account.");
        }
    }
}
