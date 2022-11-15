package com.tonymenza.restaurantwarehousesupply.service;

import com.tonymenza.restaurantwarehousesupply.entity.ProductCompany;
import com.tonymenza.restaurantwarehousesupply.repository.ProductCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCompanyServiceImpl implements ProductCompanyService {

    @Autowired
    private ProductCompanyRepository productCompanyRepository;

    @Override
    public ProductCompany saveProductCompany(ProductCompany productCompany) {
        return productCompanyRepository.save(productCompany);
    }

    @Override
    public List<ProductCompany> fetchProductCompanyList() {
        return productCompanyRepository.findAll();
    }


}
