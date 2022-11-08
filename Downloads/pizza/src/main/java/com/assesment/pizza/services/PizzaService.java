package com.assesment.pizza.services;

import com.assesment.pizza.model.Customer;
import com.assesment.pizza.model.Pizza;
import com.assesment.pizza.repository.CustomerRepository;
import com.assesment.pizza.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    CustomerRepository customerRepository;

    public Optional<Customer> getCustomerById(Long id){
        return pizzaRepository.findById(id);
    }


}
