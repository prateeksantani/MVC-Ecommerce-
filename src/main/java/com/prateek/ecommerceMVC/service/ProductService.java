package com.prateek.ecommerceMVC.service;

import com.prateek.ecommerceMVC.entity.Category;
import com.prateek.ecommerceMVC.entity.Product;
import com.prateek.ecommerceMVC.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public String addProduct(Product myProduct) {

        productRepo.getProductMap().put(myProduct.getProductId(), myProduct);
        return "added";
    }

    public Map<Integer, Product> getAllProducts() {
        return productRepo.getProductMap();
    }


    public List<Product> getAllProductsByCategory(Category category) {

        List<Product> filteredList = new ArrayList<>();
        for (Integer keyId : getAllProducts().keySet()) {
            Product product = getAllProducts().get(keyId);
            if (product.getProductCategory().equals(category))
            {
                  filteredList.add(product);
            }
        }
        return  filteredList;
    }

    public List<Product> getProductsByPrice(double lowerPrice, double higherPrice)
    {
        List<Product> filteredProductList = new ArrayList<>();

        Map<Integer,Product> productMap = getAllProducts();
       for(Integer key : productMap.keySet())
       {
           Product product = productMap.get(key);

           if(product.getProductPrice() >= lowerPrice && product.getProductPrice() <= higherPrice)
           {
               filteredProductList.add(product);
           }
       }
       return  filteredProductList;
    }


    public String addProducts(List<Product> myProducts) {

        Map<Integer,Product> productMap = getAllProducts();

        for(Product product : myProducts)
        {
           productMap.put(product.getProductId(), product);
        }
        return  myProducts.size() + "products were added.";
    }
}

