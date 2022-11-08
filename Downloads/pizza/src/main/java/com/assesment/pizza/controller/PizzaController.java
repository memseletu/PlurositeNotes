package com.assesment.pizza.controller;

import com.assesment.pizza.services.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;
}
