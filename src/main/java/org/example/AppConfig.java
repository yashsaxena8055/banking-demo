package org.example;
import org.example.repository.CustomerRepository;
import org.example.repository.CustomerRepositoryDB;
import org.example.service.CustomerService;
import org.example.service.defaultCustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

@Bean("CustomerService")
    public CustomerService getCustomerService(){
    CustomerService service=new defaultCustomerService(getCustomerRepositoryDB());
    return  service;
}
@Bean("CustomerRepository")
    public CustomerRepository getCustomerRepositoryDB(){
    CustomerRepository repository =new CustomerRepositoryDB();
    return repository;
}
}
