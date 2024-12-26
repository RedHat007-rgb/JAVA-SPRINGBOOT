package com.example.javaspringboot.DTO;

import com.example.javaspringboot.models.Category;
import com.example.javaspringboot.models.Product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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



}
