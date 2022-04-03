package com.example.productservice.services;

import java.util.List;

import com.example.productservice.model.Product;

public interface ProductService {

    public List<Product> getAllProducts();

    public Product getProductById(int id);

    public void setProducts(Product product);

    public Product updateProductById(Product product);

    public void deleteProductById(int id);
}
