package com.tonymenza.restaurantwarehousesupply.controller;

import com.tonymenza.restaurantwarehousesupply.entity.ProductCompany;
import com.tonymenza.restaurantwarehousesupply.service.ProductCompanyService;
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
public class ProductCompanyController {

    @Autowired
    private ProductCompanyService productCompanyService;

    private final Logger LOGGER = LoggerFactory.getLogger(ProductCompanyController.class);

    @PostMapping("/productCompanies")
    public ProductCompany saveProductCompany(@Valid @RequestBody ProductCompany productCompany) {
        LOGGER.info("POST: saveProductCompany");
        return productCompanyService.saveProductCompany(productCompany);
    }

    @GetMapping("/productCompanies")
    public List<ProductCompany> fetchProductCompanyList() {
        LOGGER.info("GET: fetchProductCompanyList");
        return productCompanyService.fetchProductCompanyList();
    }
}
