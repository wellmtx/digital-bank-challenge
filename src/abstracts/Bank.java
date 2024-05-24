package abstracts;

import concretes.CheckingAccount;

import java.util.List;

public abstract  class Bank {
    private final String name;
    private List<Account> accounts = new java.util.ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return this.accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    protected void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void showAccounts() {
        int totalCheckingAccounts = 0;

        for (Account account : this.accounts) {
            if (account instanceof CheckingAccount) {
                totalCheckingAccounts++;
            }
        }

        int totalSavingsAccounts = this.accounts.size() - totalCheckingAccounts;

        System.out.println("=== Accounts of " + this.name + " Bank ===");
        System.out.println("Total accounts: " + this.accounts.size());
        System.out.println("Total checking accounts: " + totalCheckingAccounts);
        System.out.println("Total savings accounts: " + totalSavingsAccounts);
    }
}
