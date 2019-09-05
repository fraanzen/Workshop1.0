package se.ecutb.grupp;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    @Test
    public  void test_is_valid (){
        Customer testPerson = new Customer("Edvin", "Andersson", "edvin_andersson@gmail.com");
        Assert.assertNotNull(testPerson.getId());
        Assert.assertEquals(testPerson.getFirstName(), "Edvin");
        Assert.assertEquals(testPerson.getLastName(), "Andersson");
        Assert.assertEquals(testPerson.geteMail(), "edvin_andersson@gmail.com");

    }

    @Test
    public void array_test(){
        CustomerList testList = new CustomerList();
        Customer c1 = new Customer("Nils", "Nilsson", "a@b.com");
        Customer c2 = new Customer("Nisse", "Nilsson", "ab@b.com");
        Customer c4 = new Customer("N", "Karlsson", "aa@b.com");

        testList.addCustomer(c1);
        testList.addCustomer(c2);
        testList.addCustomer(c4);

        Assert.assertEquals(testList.getCustomers().length,3);

    }
    @Test
    public void array_test_email(){
        CustomerList testList = new CustomerList();
        Customer c1 = new Customer("Nils", "Nilsson", "a@b.com");
        Customer c2 = new Customer("Nisse", "Nilsson", "ab@b.com");
        Customer c4 = new Customer("N", "Karlsson", "a@b.com");

        testList.addCustomer(c1);
        testList.addCustomer(c2);
        testList.addCustomer(c4);

        Assert.assertEquals(testList.getCustomers().length,2);
    }

    @Test
    public void remove_from_array(){
        int index = 2;
        CustomerList testList = new CustomerList();
        Customer c1 = new Customer("Nils", "Nilsson", "a@b.com");
        Customer c2 = new Customer("Nisse", "Nilsson", "ab@b.com");
        Customer c4 = new Customer("N", "Karlsson", "aa@b.com");

        testList.addCustomer(c1);
        testList.addCustomer(c2);
        testList.addCustomer(c4);

        Assert.assertEquals(testList.getCustomers().length,3);

        testList.removeAtIndex(index);
        Assert.assertEquals(testList.getCustomers().length,2);

    }

}
