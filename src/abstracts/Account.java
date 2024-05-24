package abstracts;

import interfaces.AccountInterface;
import models.Customer;

public abstract class Account implements AccountInterface {
    private static final int DEFAULT_AGENCY = 1;
    private static final int SEQUENTIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Customer holder;

    public Account(Customer holder) {
        this.agency = Account.DEFAULT_AGENCY;
        this.number = Account.SEQUENTIAL;
        this.holder = holder;
    }

    @Override
    public void withdraw(double value) {
        if (this.balance >= value) {
            this.balance -= value;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public void transfer(double value, AccountInterface destination) {
        if (this.balance >= value) {
            this.withdraw(value);
            destination.deposit(value);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void showExtract() {
        System.out.println("Balance: " + this.balance);
    }

    public void showInfo() {
        System.out.println("Agency: " + this.agency);
        System.out.println("Number: " + this.number);
        System.out.println("Balance: " + this.balance);
        System.out.println("Holder: " + this.holder.getName());
    }
}
