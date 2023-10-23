package com.prateek.ecommerceMVC.repo;

import com.prateek.ecommerceMVC.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.Map;


@Component
public class ProductRepo {

    @Autowired
    private  Map<Integer, Product> productMap;

    public Map<Integer, Product> getProductMap() {
        return productMap;
    }
}
