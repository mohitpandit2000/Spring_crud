package com.learn.project.service;

import com.learn.project.model.Product;
import com.learn.project.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;
//    List<Product> products=
//            new ArrayList<>(Arrays.asList(
//                    new Product(1,"car",90),
//                    new Product(4,"aeroplane",2000),
//                    new Product(2,"bike",40),
//                    new Product(3,"Scooty",20)
//            ));

    public List<Product> getProducts(){
        return productRepo.findAll();
    }
    public Product getProductById(int id){
        return productRepo.findById(id).orElse(new Product());
    }

    public void addProduct(Product product){
        productRepo.save(product);
    }

    public void updateProduct(Product product){
       productRepo.save(product);
    }
    public void deleteProductId(int id){
       productRepo.deleteById(id);
    }
}
