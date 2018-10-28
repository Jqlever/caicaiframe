package com.example.springmongodbsample.dao;

import com.example.springmongodbsample.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByName(String name);
}
