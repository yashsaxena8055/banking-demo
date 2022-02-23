package org.example.service;

import org.example.model.Customer;
import org.example.repository.CustomerRepository;

import java.util.List;
import java.util.stream.Collectors;

public class defaultCustomerService implements CustomerService {


    private CustomerRepository repository;

//     below is dependency injection

    public defaultCustomerService(CustomerRepository repository) {
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
