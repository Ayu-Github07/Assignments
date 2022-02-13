package com.example.assignment8.Controller;

import java.util.List;
import java.util.Optional;

import com.example.assignment8.Models.Customer;
import com.example.assignment8.Services.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAll() {
        try {
            List<Customer> list = customerService.getAllCustomers();
            return ResponseEntity.of(Optional.of(list));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int id) {
        try {
            Customer customer = customerService.getCustomerById(id);
            return ResponseEntity.of(Optional.of(customer));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping("/customers/name")
    public ResponseEntity<Customer> getCustomerByName(@RequestParam(value = "name") String name) {
        try {
            Customer customer = customerService.getCustomerByName(name);
            return ResponseEntity.of(Optional.of(customer));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping("/customers")
    public ResponseEntity<Customer> addCustomers(@RequestBody Customer customer) {
        try {
            customerService.addCustomer(customer);
            return ResponseEntity.ok().body(customer);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/customers/{id}")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer, @PathVariable("id") int id) {
        try {
            Customer customer1 = customerService.updateCustomer(customer);
            return ResponseEntity.ok().body(customer1);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/customers/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") int id) {
        try {
            Customer customer = customerService.getCustomerById(id);
            customerService.deleteCustomer(id);
            return ResponseEntity.ok().body(customer);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
