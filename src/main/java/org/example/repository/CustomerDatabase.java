package org.example.repository;

import org.example.model.Customer;

import java.util.List;

public interface CustomerDatabase {

    public List<Customer> findAll();
}