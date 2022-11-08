package com.assesment.pizza.services;

import com.assesment.pizza.model.Customer;
import com.assesment.pizza.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServices {

    @Autowired
    private CustomerRepository customerRepository;

    public Optional<Customer> getCustomerById(Long id){
       return customerRepository.findById(id);
    }

    public ResponseEntity<Iterable<Customer>> getAllCustomers(Customer customers){
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }
}
