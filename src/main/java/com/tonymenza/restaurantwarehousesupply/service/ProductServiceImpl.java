package com.tonymenza.restaurantwarehousesupply.service;

import com.tonymenza.restaurantwarehousesupply.entity.Product;
import com.tonymenza.restaurantwarehousesupply.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
