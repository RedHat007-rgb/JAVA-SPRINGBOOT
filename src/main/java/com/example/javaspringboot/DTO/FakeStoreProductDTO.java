package com.example.javaspringboot.DTO;

import com.example.javaspringboot.models.Category;
import com.example.javaspringboot.models.Product;


public class FakeStoreProductDTO {

    private long id;
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;

    public Product getProduct() {
        Product product=new Product();
        product.setId(id);
        product.setTitle(title);
        product.setPrice(price);
        product.setDescription(description);
        product.setImageUrl(image);
        
        Category cat=new Category();
        cat.setTitle(category);
        product.setCategory(cat);


        return product;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
        



}
