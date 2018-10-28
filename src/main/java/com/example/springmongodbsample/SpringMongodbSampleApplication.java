package com.example.springmongodbsample;

import com.example.springmongodbsample.dao.CustomerRepository;
import com.example.springmongodbsample.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMongodbSampleApplication {

    @Autowired
    private CustomerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringMongodbSampleApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        repository.save(new Customer("a", "li", "20"));
//        repository.save(new Customer("liu", "30"));
//        Customer customer = repository.findByName("liu");
//        System.out.println("age："+customer.getAge());
//    }
}
