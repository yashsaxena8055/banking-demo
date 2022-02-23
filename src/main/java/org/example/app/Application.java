package org.example.app;

import org.example.model.Customer;
import org.example.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
// ioc : invertion of control

public class Application {
    public static void main(String[] args) {

        //calling for stub database
        //wiring your application
//        defaultCustomerService service=new defaultCustomerService(new CustomerRepositoryStub());

        //Principle: Always do programing in interface not on implementation

//        CustomerService service= new defaultCustomerService(new CustomerRepositoryStub());
//
//        List<Customer> customers=service.getAllCustomers();
//
//       //when we print any thing then java look for .toString()
//        customers.forEach(System.out::println);
//
//        // calling original database
//        System.out.println("-------------------------------------------");
//        service=new defaultCustomerService(new CustomerRepositoryDB());
//        List<Customer> customer=service.getAllCustomers();
//
//        //when we print any thing then java look for .toString()
//        customer.forEach(System.out::println);

        //*----------USING SPRING FRAME WORK---------------*

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService service=context.getBean("CustomerService",CustomerService.class);

        List<Customer> customers=service.getAllCustomers();

        customers.forEach(System.out::println);


    }
}
