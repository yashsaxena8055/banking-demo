package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"org.example"})
public class AppConfig {

//@Bean("customerService")
//@Scope(value = BeanDefinition.SCOPE_SINGLETON)
//    public CustomerService getCustomerService(){
//    CustomerService service=new defaultCustomerService(getCustomerRepositoryDB());
//    return  service;
//}
//@Bean("CustomerRepository")
//    public CustomerRepository getCustomerRepositoryDB(){
//    CustomerRepository repository =new CustomerRepositoryDB();
//    return repository;
//}
}
