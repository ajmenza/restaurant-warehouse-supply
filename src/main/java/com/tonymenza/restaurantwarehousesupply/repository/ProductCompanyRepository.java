package com.tonymenza.restaurantwarehousesupply.repository;

import com.tonymenza.restaurantwarehousesupply.entity.ProductCompany;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCompanyRepository extends JpaRepository<ProductCompany, Long> {
}
