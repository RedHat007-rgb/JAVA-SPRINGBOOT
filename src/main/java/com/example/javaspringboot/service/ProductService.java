package com.example.javaspringboot.service;

import com.example.javaspringboot.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(long id);
    List<Product> getallProducts();
    void createProduct(Product product);
}
