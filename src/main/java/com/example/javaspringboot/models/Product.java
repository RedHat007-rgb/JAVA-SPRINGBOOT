package com.example.javaspringboot.models;





public class Product {
    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    private String title;
    private String description;
    private Double price;
    private String imageUrl;
    private Category category;

    public Product(){

    }
    public Product(Long id, String title, String description, Double price, Category category, String imageUrl) {
        this.id=id;
        this.title=title;
        this.description=description;
        this.category=category;
        this.price=price;
        this.imageUrl=imageUrl;
    }
}
