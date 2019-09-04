package se.ecutb.grupp;


public class App {
    public static void main(String[] args) {

        Customer c1 = new Customer("Nils", "Nilsson", "a@b.com");
        Customer c2 = new Customer("Nisse", "Nilsson", "ab@b.com");
        Customer c3 = new Customer("Nii", "Jsson", "ac@b.com");
        Customer c4 = new Customer("N", "Karlsson", "a@b.com");

        CustomerList list = new CustomerList();

        list.addCustomer(c1);
        list.addCustomer(c2);
        list.addCustomer(c3);
        list.addCustomer(c4);
        list.printCustomers();


    }

}
