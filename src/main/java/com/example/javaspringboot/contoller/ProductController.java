package com.example.javaspringboot.contoller;


import com.example.javaspringboot.models.Product;
import com.example.javaspringboot.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {


    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService=productService;
    }


    @RequestMapping(value="/products",method=RequestMethod.POST)
    public void createProduct(Product product){

    }

    @RequestMapping(value="/find",method= RequestMethod.GET)
    public Product getProduct(){
        return null;
    }

    @RequestMapping(value="/update",method= RequestMethod.PATCH)
    public void updateProduct(Product product){

    }

    @RequestMapping(value="/delete",method= RequestMethod.DELETE)
    public void deleteProduct(long id){

    }
}
