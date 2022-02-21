package org.example.repository;

import org.example.model.Customer;

import java.util.List;

import static java.util.Arrays.asList;

public class CustomerRepositoryStub implements CustomerDatabase {

        @Override
    public List<Customer> findAll() {
        List<Customer> customers=asList(
                new Customer("1","Yash Saxena","Lakhimpur -kheri"),
                new Customer("2","Kriti","Delhi"),
                new Customer("3","Ankita","Jhansi")
        );
        return customers;
    }
}
