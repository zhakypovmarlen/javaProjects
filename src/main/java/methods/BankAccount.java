package methods;

public class BankAccount {

    String accountNumber;    // no more no less than 8
    String accountHolderName;  // // should not be null or empty, should be less than 256 chars
    double balance;   // should not be negative
    double dailyWithdrawLimit = 5000;
    double dailyWithdrawedAmount;

    public void deposit(double amount){
        balance += amount;
        System.out.println("Successfully deposited = " + amount + "$");
        System.out.println("Your balance after deposit is = " + balance );
    }

    public boolean withdraw(double amount) {
        if(amount <= 0 || amount > dailyWithdrawLimit || amount > balance || balance < 0){
            System.out.println("The amount to withdraw is not correct, or ur balance has insufficient funds, or daily withdrawal limit is exceeded.");
            return false;
        }
        dailyWithdrawedAmount += amount;

        if(dailyWithdrawedAmount > dailyWithdrawLimit){
            System.out.println("Daily withdrawal limit is exceeded.");
            return false;
        }

        balance -= amount;
        System.out.println("Withdrawing amount is = " + amount + "$");
        System.out.println("The balance after withdrawal is = " + balance);
        return true;
    }

    public void setAccountNumber(String accountNumber){
        boolean isValidAccountNumber = true;
        if(accountNumber.length() == 8){
            for(int i = 0; i < 8; i++){
                if(!Character.isDigit(accountNumber.charAt(i))){
                    System.out.println("WARNING: The account number must only contain digits.");
                    isValidAccountNumber = false;
                    break;
                }

            }
        }
        else {
            System.out.println("WARNING: The length of the account number must be 8.");
            isValidAccountNumber = false;
        }
        if(isValidAccountNumber){
            System.out.println("SUCCESSFUL: Account number is valid.");
            this.accountNumber = accountNumber;
        } else {
            System.out.println("FAILURE: The provided account number is not valid!");
        }
    }

    public String getAccountNumber(){
        System.out.println("Account number - " + accountNumber);
        return accountNumber;
    }

    public void setAccountHolderName(String accountHolderName){
        boolean isValidAccountHolderName = true;
        if(accountHolderName.equals(null)
                || accountHolderName.length() > 256 || accountHolderName.trim().length() == 0){
            isValidAccountHolderName = false;
        }
        if(isValidAccountHolderName){
            System.out.println("SUCCESS: Account holder name is valid.");
            this.accountHolderName = accountHolderName;
        }
        else {
            System.out.println("FAILURE: Account holder name must not be empty or more than 256 letters.");
        }
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public double getBalance(){
        return balance;
    }
    public void printInfo(){
        System.out.println("Account holder's name: " + accountHolderName + "\n" +
        "Account number: " + accountNumber + "\n" +
        "Current balance: " + balance + "\n" +
        "Today withdrawed: " + dailyWithdrawedAmount + "$");

    }

}
