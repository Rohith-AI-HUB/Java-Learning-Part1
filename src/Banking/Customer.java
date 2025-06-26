package Banking;

public class Customer {
    public static void main(String[] args) {
        BankAccount account  = new BankAccount("123456789", "John Doe", 1000.0);
        account.deposit(100);
        System.out.println("Withdrawal amount: " + account.withdraw(0));
    }
}
