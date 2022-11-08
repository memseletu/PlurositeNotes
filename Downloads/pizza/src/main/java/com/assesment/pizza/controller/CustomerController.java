package com.assesment.pizza.controller;

import com.assesment.pizza.model.Customer;
import com.assesment.pizza.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerServices customerService;


    @GetMapping("/customer/{customerId}")
    public Optional<Customer> getCustomerById(@PathVariable Long customerId){
        return customerService.getCustomerById(customerId);
    }

    @GetMapping("/customer")
    public ResponseEntity<Iterable<Customer>> getAllCustomers(Customer customers){
        return customerService.getAllCustomers(customers);
    }
}
