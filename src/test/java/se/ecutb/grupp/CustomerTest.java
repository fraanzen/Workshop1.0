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

}
