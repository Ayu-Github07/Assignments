package com.example.productservice.repository;

import com.example.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends MongoRepository<Product, Integer> {

    public Product findByPid(int id);
}
