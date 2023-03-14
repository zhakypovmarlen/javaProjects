package methods;

public class Bank {
    public static void main(String[] args) {

        BankAccount client1 = new BankAccount();
        BankAccount client2 = new BankAccount();

        client1.setAccountNumber("12345678");
        client1.setAccountHolderName("Marlen Zhakypov");
        client1.deposit(1900);
        client1.withdraw(200);
        System.out.println(client1.getBalance());

        client2.setAccountNumber("87654321");
        client2.setAccountHolderName("Michael Jordan");
        client2.deposit(100);
        client2.withdraw(99);
        System.out.println(client2.getBalance());
        client2.printInfo();
        client2.withdraw(0);


    }
}
