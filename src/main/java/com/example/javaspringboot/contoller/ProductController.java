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
    public Product createProduct(@RequestBody Product product){
        Product p =productService.createProduct(product.getId(),product.getTitle(),product.getPrice(),product.getDescription(),product.getImageUrl(),product.getCategory().getTitle());
        return  p;
    }

    @RequestMapping(value="/find/{id}",method= RequestMethod.GET)
    public Product getProduct(@PathVariable long id){
        Product p=productService.getSingleProduct(id);
        return p;
    }

    @RequestMapping(value="/update",method= RequestMethod.PATCH)
    public void updateProduct(Product product){

    }

    @RequestMapping(value="/delete",method= RequestMethod.DELETE)
    public void deleteProduct(long id){

    }
}
