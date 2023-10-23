package com.prateek.ecommerceMVC.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @NotNull (message = "id of the product should not be null!!")
    private Integer productId;
    @NotEmpty(message = "Name of the product should not be empty!!")
    @Size(min = 4, max = 12)
    //@Pattern (regexp = " condition ")  //make condition for input like start with capital using Validation
    private String productName;
    private double productPrice;

    private Category productCategory;


}
