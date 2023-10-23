package com.prateek.ecommerceMVC.controller;

import com.prateek.ecommerceMVC.entity.Category;
import com.prateek.ecommerceMVC.entity.Product;
import com.prateek.ecommerceMVC.service.ProductService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@Validated
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("product")
    public String  addProduct(@RequestBody @Valid Product myProduct)
    {
        return productService.addProduct(myProduct);
    }

    @PostMapping("products")
    public String  addProduct(@RequestBody @Valid List<Product> myProducts)
    {
        return productService.addProducts(myProducts);
    }

    @GetMapping("products")
    public Map<Integer,Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @GetMapping("products/category/{category}")
    public List<Product> getAllProductsByCategory(@PathVariable Category category){
        return productService.getAllProductsByCategory(category);
    }

    @GetMapping("products/filter/lowerPrice/{lowerPrice}/higherPrice/{higherPrice}")
    List<Product> getProductByPriceRange(@PathVariable @Min(0) double lowerPrice, @PathVariable @Max(value = 10000,message = "price cannot exceed 10000") double higherPrice)
    {
        return  productService.getProductsByPrice(lowerPrice,higherPrice);
    }
}
