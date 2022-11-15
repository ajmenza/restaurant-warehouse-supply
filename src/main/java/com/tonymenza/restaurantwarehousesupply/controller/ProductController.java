package com.tonymenza.restaurantwarehousesupply.controller;

import com.tonymenza.restaurantwarehousesupply.entity.Product;
import com.tonymenza.restaurantwarehousesupply.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    private final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @PostMapping("/products")
    public Product saveProduct(@Valid @RequestBody Product product) {
        LOGGER.info("POST: saveProduct");
        return productService.saveProduct(product);
    }

    @GetMapping("/products")
    public List<Product> fetchProductList() {
        LOGGER.info("GET: fetchProductList");
        return productService.fetchProductList();
    }

}
