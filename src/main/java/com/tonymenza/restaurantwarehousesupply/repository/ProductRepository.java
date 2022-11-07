package com.tonymenza.restaurantwarehousesupply.repository;

import com.tonymenza.restaurantwarehousesupply.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
