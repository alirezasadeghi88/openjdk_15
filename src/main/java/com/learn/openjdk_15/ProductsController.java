package com.learn.openjdk_15;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductsController {
    private final ProductService productService;
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }
    @RequestMapping("/products")
    public String viewProducts(Model model) {
        var products = productService.findAll();
        model.addText("products");
        return "products.html";
    }
}
