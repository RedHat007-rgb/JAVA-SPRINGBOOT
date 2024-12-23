package com.example.javaspringboot.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private Category category;

    public Product(){

    }
    public Product(Long id, String title, String description, Double price, Category category) {
        this.id=id;
        this.title=title;
        this.description=description;
        this.category=category;
        this.price=price;
    }
}
