import concretes.CheckingAccount;
import concretes.ItauBank;
import concretes.SantanderBank;
import concretes.SavingsAccount;
import models.Customer;

public class Main {
    public static void main(String[] args) {
        SantanderBank santander = new SantanderBank();
        ItauBank itau = new ItauBank();

        Customer customer = new Customer();
        customer.setName("John Doe");

        CheckingAccount checkingAccount = new CheckingAccount(customer);
        SavingsAccount savingsAccount = new SavingsAccount(customer);

        santander.addAccount(checkingAccount);
        santander.addAccount(savingsAccount);
        santander.showAccounts();

        checkingAccount.deposit(1000);
        checkingAccount.transfer(500, savingsAccount);

        checkingAccount.showExtract();
        savingsAccount.showExtract();

        Customer customer2 = new Customer();
        customer2.setName("Wellington");

        CheckingAccount checkingAccount2 = new CheckingAccount(customer2);
        SavingsAccount savingsAccount2 = new SavingsAccount(customer2);

        itau.addAccount(checkingAccount2);
        itau.addAccount(savingsAccount2);
        itau.showAccounts();
    }
}