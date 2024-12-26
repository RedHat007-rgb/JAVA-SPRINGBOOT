package com.example.javaspringboot.service;

import com.example.javaspringboot.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FakeStoreService implements ProductService {

    public Product getSingleProduct(long id){
        return null;
    }

    public List<Product>  getallProducts(){
        return List.of();
    }

    public void createProduct(Product product){

    }
}
