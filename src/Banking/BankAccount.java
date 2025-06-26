package Banking;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
    }

    public double withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
        } else if(amount <= 0){
            System.out.println("Withdrawal amount must be greater than 0");
        } else {
            System.out.println("Insufficient funds");
        }
        
        return amount;
    }
}
