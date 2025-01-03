package com.example.javaspringboot.service;

import com.example.javaspringboot.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(long id);
    List<Product> getallProducts();
    Product createProduct(long id, String title, Double price, String description, String image, String category);
}
