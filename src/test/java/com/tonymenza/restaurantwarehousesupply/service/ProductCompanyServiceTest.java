package com.tonymenza.restaurantwarehousesupply.service;

import com.tonymenza.restaurantwarehousesupply.entity.Product;
import com.tonymenza.restaurantwarehousesupply.entity.ProductCompany;
import com.tonymenza.restaurantwarehousesupply.repository.ProductCompanyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(ProductCompanyService.class)
class ProductCompanyServiceTest {

    @Autowired
    private ProductCompanyService productCompanyService;

    @MockBean
    private ProductCompanyRepository productCompanyRepository;

    @BeforeEach
    void setUp() {
        ProductCompany productCompany = ProductCompany.builder()
                .productCompanyId(1L)
                .productCompanyName("Walk-in Box")
                .build();

//        Mockito.when(productCompanyRepository.find)
    }


    @Test
    @Disabled
    void saveProductCompany(ProductCompany productCompany) {
        productCompanyRepository.save(productCompany);
        productCompanyRepository.findAll();
    }

//    @Test
//    void fetchProductCompanyList() {
//    }
}