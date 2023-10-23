package com.prateek.ecommerceMVC.service;

import com.prateek.ecommerceMVC.entity.Product;
import com.prateek.ecommerceMVC.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public String addProduct(Product myProduct) {

        productRepo.getProductMap().put(myProduct.getProductId(),myProduct);
        return  "added";
    }

    public Map<Integer,Product> getAllProducts() {
        return productRepo.getProductMap();
    }
}
