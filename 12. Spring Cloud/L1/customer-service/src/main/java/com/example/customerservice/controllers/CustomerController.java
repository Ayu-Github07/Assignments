package com.example.customerservice.controllers;

import java.util.List;

import com.example.customerservice.classes.MyOrder;
import com.example.customerservice.model.Customer;
import com.example.customerservice.services.CustomerServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @PostMapping("/")
    public String setCustomers(@RequestBody Customer customer) {
        customerService.setCustomer(customer);

        return "Customer Added Successfully!!";
    }

    @GetMapping("/myorders/{id}")
    public MyOrder myProductOrders(@PathVariable("id") int custId) {
        return customerService.getMyOrders(custId);
    }

    @GetMapping("/")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
