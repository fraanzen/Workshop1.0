package se.ecutb.grupp;

import org.junit.Assert;
import org.junit.Test;

public class BankTest {

    Customer testCustomer = new Customer("Test", "Testson", "test@test.test");
    Customer testCustomer1 = new Customer("Test", "Testson", "teest@test.test");
    BankAccount testAccount = new BankAccount(testCustomer);
    BankAccount testAccount2 = new BankAccount(testCustomer1);


    @Test
    public void check_accounts() {
        BankAccount testAcc = new BankAccount(testCustomer);
        Assert.assertEquals(testAcc.getAccountId(), 1003);
    }

    @Test
    public void add_bank_account() {
        Bank bankList = new Bank();
        BankAccount testList = new BankAccount(testCustomer);
        BankAccount testAcc2 = new BankAccount(testCustomer1);
        bankList.addAccount(testAcc2);

        Assert.assertEquals(bankList.getBankAccounts().length, 1);
        Assert.assertEquals(bankList.addAccount(testAccount), true);
    }

    @Test
    public void remove_bank_account() {
        Bank bankList = new Bank();
        BankAccount testList = new BankAccount(testCustomer);
        BankAccount testAcc2 = new BankAccount(testCustomer1);
        bankList.addAccount(testAcc2);
        Assert.assertEquals(bankList.getBankAccounts().length,1);
        bankList.removeAtIndex(0);
        Assert.assertEquals(bankList.getBankAccounts().length,0);


    }
}


