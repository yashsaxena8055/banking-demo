package org.example.service;

import org.example.model.Customer;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CustomerService {


    public List<Customer> getAllCustomers() ;
    public ResponseEntity<Customer> getCustomer(Long id);

   public Customer saveCustomer(Customer customer);
    public void deleteCustomer(long id);

    Customer updateCustomer(Long id,Customer customer);
}