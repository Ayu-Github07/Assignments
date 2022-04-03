package com.example.customerservice.classes;

import com.example.customerservice.model.Customer;

public class MyOrder {

    private Customer customer;
    private Product product;

    public MyOrder() {
    }

    public MyOrder(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "MyOrder [customer=" + customer + ", product=" + product + "]";
    }

}
