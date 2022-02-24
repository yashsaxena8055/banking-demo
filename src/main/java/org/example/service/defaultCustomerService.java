package org.example.service;

import org.example.model.Customer;
import org.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("customerService")
public class defaultCustomerService implements CustomerService {

    @Autowired
    private CustomerRepository repository;



    public defaultCustomerService(){};

    public void setRepository(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> getAllCustomers() {

        return repository.findAll();
    }

    @Override
    public Customer getCustomer(Long id) {
        Optional<Customer> optionalCustomer= repository.findById(id);
        return optionalCustomer.get();
    }

}
