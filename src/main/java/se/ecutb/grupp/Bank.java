package se.ecutb.grupp;

import java.util.Arrays;

public class Bank {
    private BankAccount[] bankAccounts = new BankAccount[0];

    public Bank() {
        this.bankAccounts = bankAccounts;
    }

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public boolean checkAccount(int accountId) {
        for (int i = 0; i < bankAccounts.length; i++) {
            if (accountId == bankAccounts[i].getAccountId()) {
                return true;
            }
        }
        return false;
    }

    public boolean addAccount(BankAccount accounts) {
        if (!checkAccount(accounts.getAccountId())) {
            bankAccounts = Arrays.copyOf(bankAccounts, bankAccounts.length + 1);
            bankAccounts[bankAccounts.length - 1] = accounts;
            return true;
        }
        return false;

    }

    public void removeAtIndex(int index) {
        BankAccount[] newList = new BankAccount[bankAccounts.length - 1];
        for (int i = 0; i < bankAccounts.length; i++) {
            if (i != index) {
                newList[i] = bankAccounts[i];
            }

        }
        bankAccounts = newList;
    }
}
