package concretes;

import abstracts.Account;
import models.Customer;

public class CheckingAccount extends Account {
    public CheckingAccount(Customer holder) {
        super(holder);
    }

    @Override
    public void showExtract() {
        System.out.println("=== Extract of Checking Account ===");
        this.showInfo();
    }
}
