package com.tonymenza.restaurantwarehousesupply.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data // Gives getters setters etc with lombok
@NoArgsConstructor // Default constructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    @NotBlank(message = "Please Add Product Name")
    private String productName;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "product_company_id",
            referencedColumnName = "productCompanyId"
    )
    private ProductCompany productCompany;

    private float productPrice;

    private String productDescription;

    private String productCategory;
}
