package com.example.productservice.controller;

import java.util.List;

import com.example.productservice.model.Product;
import com.example.productservice.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public List<Product> getAllProducts() {

        return productService.getAllProducts();
    }

    @PostMapping("/")
    public String setProduct(@RequestBody Product product) {

        productService.setProducts(product);

        return "Product Added Successfully!!";
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") int id) {

        return productService.getProductById(id);
    }
}
