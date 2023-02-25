package other.nullobject;

public class Demo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(new ConsoleLog());
        bankAccount.deposit(100);
        bankAccount.withdraw(12);
        bankAccount.withdraw(90);

        //Here no need to check null condition
        BankAccount bankAccountWithNullMsg = new BankAccount(new NullLog());
        bankAccountWithNullMsg.deposit(100);
        bankAccountWithNullMsg.withdraw(12);
        bankAccountWithNullMsg.withdraw(90);
    }
}
