package com.learn.project.controller;

import com.learn.project.model.Product;
import com.learn.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @RequestMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id){
        productService.deleteProductId(id);
    }

}
