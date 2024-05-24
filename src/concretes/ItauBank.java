package concretes;

import abstracts.Account;
import abstracts.Bank;

import java.util.List;

public class ItauBank extends Bank {
    public ItauBank() {
        super("Itaú");
    }

    @Override
    public void addAccount(Account account) {
        List<Account> accounts = this.getAccounts();

        accounts.add(account);

        this.setAccounts(accounts);
    }
}
