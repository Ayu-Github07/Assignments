package com.example.assignment4.controller;

import com.example.assignment4.service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    private Service service;

    @GetMapping(path = "/credit-card/{id}")
    public String creditCard(@PathVariable("id") long number) {
        boolean ans = service.isValid(number);

        if (ans == true) {
            return "Credit card is valid";
        }
        return "Credit card is not valid";
    }
}
