package org.example.service;

import org.example.model.Customer;
import org.example.repository.CustomerDatabase;
import org.example.repository.CustomerRepositoryDB;

import java.util.List;
import java.util.stream.Collectors;

public class defaultCustomerService {

    private CustomerDatabase repository;

    public defaultCustomerService(CustomerDatabase repository) {
        this.repository = repository;
    }

    public List<Customer> getAllCustomers() {

        return repository.findAll();
    }
    public List<Customer> getAllCustomersWithStars() {

        return repository.findAll().stream()
                .map(c-> new Customer(c.getId(),"****"+c.getName()+"***",c.getCity()))
                .collect(Collectors.toList());
    }
}
