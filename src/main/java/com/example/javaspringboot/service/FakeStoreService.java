package com.example.javaspringboot.service;

import com.example.javaspringboot.DTO.FakeStoreProductDTO;
import com.example.javaspringboot.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class FakeStoreService implements ProductService {

    public RestTemplate restTemplate;

    public FakeStoreService(RestTemplate restTemplate){
    this.restTemplate=restTemplate;
    }

    public Product getSingleProduct(long id){
        FakeStoreProductDTO fakeStoreProductDTO=
        restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeStoreProductDTO.class);
        return fakeStoreProductDTO.getProduct();
    }

    public List<Product>  getallProducts(){
        return List.of();
    }
   
    public Product  createProduct(long id, String title, Double price, String description, String image, String category){
        FakeStoreProductDTO fakeStoreProductDTO=new FakeStoreProductDTO();
        fakeStoreProductDTO.setId(id);
        fakeStoreProductDTO.setPrice(price);
        fakeStoreProductDTO.setTitle(title);
        fakeStoreProductDTO.setImage(image);
        fakeStoreProductDTO.setCategory(category);
        fakeStoreProductDTO.setDescription(description);

        FakeStoreProductDTO response=restTemplate.postForObject("https://fakestoreapi.com/products/",fakeStoreProductDTO, FakeStoreProductDTO.class);

        return response.getProduct();
    }

}
