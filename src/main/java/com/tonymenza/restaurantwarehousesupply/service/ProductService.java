package com.tonymenza.restaurantwarehousesupply.service;

import com.tonymenza.restaurantwarehousesupply.entity.Product;

import java.util.List;

public interface ProductService {
    public Product saveProduct(Product product);

    public List<Product> fetchProductList();
}
