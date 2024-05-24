package concretes;

import abstracts.Account;
import models.Customer;

public class SavingsAccount extends Account {
    public SavingsAccount(Customer holder) {
        super(holder);
    }

    @Override
    public void showExtract() {
        System.out.println("=== Extract of Savings Account ===");
        this.showInfo();
    }
}
