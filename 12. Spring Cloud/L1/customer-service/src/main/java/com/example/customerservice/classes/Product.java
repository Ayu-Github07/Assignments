package com.example.customerservice.classes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    private int pid;
    private String productName;
    private double productPrice;

    public Product() {
    }

    public Product(int pid, String productName, double productPrice) {
        this.pid = pid;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product [pid=" + pid + ", productName=" + productName + ", productPrice=" + productPrice + "]";
    }

}
