package org.example.controller;

import org.example.model.Customer;
import org.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {
    @Autowired
    private CustomerService service;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return service.getAllCustomers();
    }
    @GetMapping
    @RequestMapping("{id}")
    public  Customer getCustomer( @PathVariable long id){
            return service.getCustomer(id);
    }
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public  List<Customer> deleteCustomer( @PathVariable long id){
        service.deleteCustomer(id);
        return service.getAllCustomers();

    }
}
