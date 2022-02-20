package com.example.assignment8.Dao;

import com.example.assignment8.Models.Order;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends MongoRepository<Order, Integer> {

}
