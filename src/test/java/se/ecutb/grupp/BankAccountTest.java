package se.ecutb.grupp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class BankAccountTest {
    Customer testCustomer = new Customer("Test", "Testson", "test@test.test");
    Customer testCustomer1 = new Customer("Test", "Testson", "teest@test.test");
    BankAccount testAccount = new BankAccount(testCustomer);
    BankAccount testAccount2 = new BankAccount(testCustomer1);

    @Test
    public void account_gets_id(){
        Assert.assertEquals(testAccount.getAccountId(),1001);
        Assert.assertEquals(testAccount2.getAccountId(),1002);
    }

    @Test
    public void deposit_successful(){
        testAccount.deposit(500);
        Assert.assertEquals(testAccount.getBalance(),500);
    }

    @Test
    public void withdraw_successful(){
        testAccount.deposit(500);
        testAccount.withdraw(300);
        Assert.assertEquals(testAccount.getBalance(),200);
    }

    @Test
    public void too_much_withdrawn(){
        testAccount.deposit(500);
        Assert.assertEquals(testAccount.withdraw(600),false);
    }




}
