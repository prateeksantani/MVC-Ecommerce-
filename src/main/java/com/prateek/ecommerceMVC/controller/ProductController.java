package com.prateek.ecommerceMVC.controller;

import com.prateek.ecommerceMVC.entity.Product;
import com.prateek.ecommerceMVC.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("product")
    public String  addProduct(@RequestBody Product myProduct)
    {
        return productService.addProduct(myProduct);
    }

    @GetMapping("products")
    public Map<Integer,Product> getAllProducts()
    {
        return productService.getAllProducts();
    }
}
