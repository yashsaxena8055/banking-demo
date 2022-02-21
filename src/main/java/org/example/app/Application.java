package org.example.app;

import org.example.model.Customer;
import org.example.repository.CustomerRepositoryDB;
import org.example.repository.CustomerRepositoryStub;
import org.example.service.defaultCustomerService;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        //calling for stub database
        defaultCustomerService service=new defaultCustomerService(new CustomerRepositoryStub());
        List<Customer> customers=service.getAllCustomers();

       //when we print any thing then java look for .toString()
        customers.forEach(System.out::println);

        // calling original databse
        System.out.println("-------------------------------------------");
        service=new defaultCustomerService(new CustomerRepositoryDB());
        List<Customer> customer=service.getAllCustomers();

        //when we print any thing then java look for .toString()
        customer.forEach(System.out::println);


    }
}
