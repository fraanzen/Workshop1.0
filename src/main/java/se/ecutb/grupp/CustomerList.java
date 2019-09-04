package se.ecutb.grupp;

import java.util.Arrays;

public class CustomerList {
    private Customer[] customers = new Customer[0];

    public CustomerList() {
        this.customers = customers;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public boolean checkEmail(String email){
        for (int i = 0; i < customers.length; i++) {
            if(email.equalsIgnoreCase(customers[i].geteMail())){
                return true;
            }
        }
        return false;
    }

    public boolean addCustomer(Customer customer){
        if(!checkEmail(customer.geteMail())){
            customers = Arrays.copyOf(customers, customers.length + 1);
            customers[customers.length - 1] = customer;
            return true;
        }
        return false;
    }

    public boolean contains (String searchWord){
        for (int i = 0; i < customers.length; i++){
            if (customers[i].geteMail().contains(searchWord)){
                return true;
            }

        }
        return false;
    }

    public void removeAtIndex(int index){
        Customer[] newList = new Customer[customers.length - 1];
        for(int i = 0; i < customers.length; i++){
            if(i != index){
                newList[i] = customers[i];
            }

        }
        customers = newList;
    }

    public void printCustomers(){
        for (Customer c: customers) {
            System.out.println(c);
        }
    }

}

