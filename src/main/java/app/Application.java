package app;

import model.Customer;
import service.defaultCustomerService;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        defaultCustomerService service=new defaultCustomerService();
        List<Customer> customers=service.getAllCustomers();

       //when we print any thing then java look for .toString()
        customers.forEach(System.out::println);

        List<Customer> customer=service.getAllCustomersWithStars();

        //when we print any thing then java look for .toString()
        customer.forEach(System.out::println);


    }
}
