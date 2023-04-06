package Constructors;

public class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;
    double interestRate;
    double overdraftLimit;

    public BankAccount(){
        accountNumber = "unknown";
        accountHolderName = "unknown";
        balance = 0.0;
        interestRate = 0.0;
        overdraftLimit = 0.0;
    }

    public BankAccount(String accountNumber, String accountHolderName, double balance, double interestRate, double overdraftLimit){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.interestRate = interestRate;
        this.overdraftLimit = overdraftLimit;
    }

    public BankAccount(BankAccount other) {
        // Set the values from the other object
        this.accountNumber = other.accountNumber;
        this.accountHolderName = other.accountHolderName;
        this.balance = other.balance;
        this.interestRate = other.interestRate;
        this.overdraftLimit = other.overdraftLimit;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public double getBalance(){
        return balance;
    }

    public double getInterestRate(){
        return interestRate;
    }
    public double getOverdraftLimit(){
        return overdraftLimit;
    }

    public void deposit(double toDeposit){
        balance += toDeposit;
        System.out.println(toDeposit + "$ deposited. And your balance after deposit is " + balance);
    }
    public void withdraw(double toWithdraw) {
        if (balance - toWithdraw < overdraftLimit) {
            System.out.println("The withdrawal is not allowed.");
        } else {
            balance -= toWithdraw;
            System.out.println(toWithdraw + "$ withdrawn. And your balance after withdrawal is " + balance);
        }
    }

    public double calculateInterest(){
        return balance / 100 * interestRate;
    }
    public void getInfo(){
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest rate: " + interestRate);
        System.out.println("Overdraft limit: " + overdraftLimit);
    }

    public static void main(String[] args) {
        BankAccount user2 = new BankAccount("12345121233", "Volodymyr Usik",
                0, 0.3, 35);
        BankAccount user1 = new BankAccount();
        user1.getInfo();
        user2.deposit(500);
        user2.withdraw(100);
    }
}
