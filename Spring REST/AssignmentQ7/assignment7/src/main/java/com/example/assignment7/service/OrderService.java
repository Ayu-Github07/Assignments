package com.example.assignment7.service;

import java.util.List;

import com.example.assignment7.dao.OrderRepo;
import com.example.assignment7.entities.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    public void addOrder(Order order) {
        System.out.println(order);
        orderRepo.save(order);
        System.out.println("Order Added Successfully");
    }

    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    public Order getOrderById(int id) {
        return orderRepo.findById(id);
    }

    public Order getOrderByName(String name) {
        return orderRepo.findByName(name);
    }

    public Order updateOrder(Order order) {
        return orderRepo.save(order);
    }

    public void deleteOrder(int id) {
        orderRepo.deleteById(id);
    }
}
