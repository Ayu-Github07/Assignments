package com.example.customerservice.services;

import java.util.List;

import com.example.customerservice.model.Customer;

public interface CustomerService {

    public List<Customer> getAllCustomers();

    public Customer getCustomerById(int id);

    public void setCustomer(Customer customer);

    public Customer updateCustomerById(Customer customer);

    public void deleteCustomerById(int id);
}
