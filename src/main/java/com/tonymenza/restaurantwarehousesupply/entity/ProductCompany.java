package com.tonymenza.restaurantwarehousesupply.entity;

import com.tonymenza.restaurantwarehousesupply.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data // Gives getters setters etc with lombok
@NoArgsConstructor // Default constructor
@AllArgsConstructor
@Builder
public class ProductCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productCompanyId;

    @NotBlank(message = "Please Add Company Name")
    private String productCompanyName;

    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "product_id",
            referencedColumnName = "productId"
    )
    private List<Product> products;

}
