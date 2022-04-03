package com.example.customerservice.services;

import java.util.List;

import com.example.customerservice.classes.MyOrder;
import com.example.customerservice.classes.Product;
import com.example.customerservice.model.Customer;
import com.example.customerservice.repository.CustomerRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Customer> getAllCustomers() {

        return customerRepo.findAll();
    }

    @Override
    public Customer getCustomerById(int id) {

        return customerRepo.findByCustId(id);
    }

    @Override
    public void setCustomer(Customer customer) {

        customerRepo.save(customer);
    }

    @Override
    public Customer updateCustomerById(Customer customer) {

        return customerRepo.save(customer);
    }

    @Override
    public void deleteCustomerById(int id) {

        customerRepo.deleteById(id);
    }

    public MyOrder getMyOrders(int id) {

        Customer customer = customerRepo.findByCustId(id);

        int pid = customer.getPid();

        Product product = restTemplate.getForObject("http://PRODUCT-SERVICE/products/" + pid, Product.class);

        MyOrder myOrder = new MyOrder();
        myOrder.setCustomer(customer);
        myOrder.setProduct(product);

        return myOrder;
    }

}
