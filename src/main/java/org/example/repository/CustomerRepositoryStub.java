package org.example.repository;

import org.example.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

import static java.util.Arrays.asList;
@Repository("Stub")
public class CustomerRepositoryStub implements CustomerRepository {

        @Override
    public List<Customer> findAll() {
        List<Customer> customers=asList(
                new Customer("1","Yash Saxena","Lakhimpur -kheri"),
                new Customer("2","Vaibhav","Delhi"),
                new Customer("3","Tushar","Lucknow")
        );
        return customers;
    }
}
