package se.ecutb.grupp;

public class BankAccount {
    private static int accountCounter = 1000;
    private int accountId;
    private int balance = 0;
    private Customer owner;

    public BankAccount(Customer owner) {
        this.owner = owner;
        accountId = ++accountCounter;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getBalance() {
        return balance;
    }

    public Customer getOwner() {
        return owner;
    }

    public boolean deposit(int moneyDeposited){
        if (moneyDeposited > 0){
            balance = moneyDeposited + balance;
            return true;
        }return false;

    }

    public boolean withdraw(int moneyWithdraw){
        if (moneyWithdraw > 0 && moneyWithdraw < balance){
            balance = balance - moneyWithdraw;
            return true;
        }return false;
    }



}
