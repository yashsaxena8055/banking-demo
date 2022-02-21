package service;

import model.Customer;
import repository.CustomerRepositoryDB;

import java.util.List;
import java.util.stream.Collectors;

public class defaultCustomerService {

    private CustomerRepositoryDB repository = new CustomerRepositoryDB();

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }
    public List<Customer> getAllCustomersWithStars() {

        return repository.findAll().stream()
                .map(c-> new Customer(c.getId(),"****"+c.getName()+"***",c.getCity()))
                .collect(Collectors.toList());
    }
}
