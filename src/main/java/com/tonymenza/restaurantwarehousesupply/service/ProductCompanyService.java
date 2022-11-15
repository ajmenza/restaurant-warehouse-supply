package com.tonymenza.restaurantwarehousesupply.service;

import com.tonymenza.restaurantwarehousesupply.entity.ProductCompany;

import java.util.List;

public interface ProductCompanyService {
    public ProductCompany saveProductCompany(ProductCompany productCompany);

    public List<ProductCompany> fetchProductCompanyList();
}
