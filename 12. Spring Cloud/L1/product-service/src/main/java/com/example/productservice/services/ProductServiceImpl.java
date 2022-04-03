package com.example.productservice.services;

import java.util.List;

import com.example.productservice.model.Product;
import com.example.productservice.repository.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getAllProducts() {

        return productRepo.findAll();
    }

    @Override
    public Product getProductById(int id) {

        return productRepo.findByPid(id);
    }

    @Override
    public void setProducts(Product product) {

        productRepo.save(product);
    }

    @Override
    public Product updateProductById(Product product) {

        return productRepo.save(product);
    }

    @Override
    public void deleteProductById(int id) {

        productRepo.deleteById(id);
    }

}
