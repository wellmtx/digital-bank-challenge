package concretes;

import abstracts.Account;
import abstracts.Bank;

import java.util.List;

public class SantanderBank extends Bank {
    public SantanderBank() {
        super("Santander");
    }

    @Override
    public void addAccount(Account account) {
        List<Account> accounts = this.getAccounts();

        accounts.add(account);

        this.setAccounts(accounts);
    }
}
