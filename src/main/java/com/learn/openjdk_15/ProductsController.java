package com.learn.openjdk_15;

import org.springframework.stereotype.Controller;

@Controller
public class ProductsController {
    private final ProductService productService;
    public ProductsController(
            ProductService productService) {
        this.productService = productService;
    }
}
