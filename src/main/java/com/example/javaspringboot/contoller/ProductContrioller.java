package com.example.javaspringboot.contoller;


import com.example.javaspringboot.models.Product;
import org.apache.coyote.Request;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductContrioller {

    @RequestMapping(value="/products",method=RequestMethod.POST)
    @PostMapping("/products")
    public void createProduct(Product product){

    }
    @RequestMapping(value="/find",method= RequestMethod.GET)
    public Product getProduct(long id){
    return null;
    }
    @RequestMapping(value="/update",method= RequestMethod.PATCH)
    public void updateProduct(Product product){

    }
    @RequestMapping(value="/delete",method= RequestMethod.DELETE)
    public void deleteProduct(long id){

    }




}
