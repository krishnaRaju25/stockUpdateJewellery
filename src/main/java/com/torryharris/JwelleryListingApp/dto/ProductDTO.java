package com.torryharris.JwelleryListingApp.dto;

import com.torryharris.JwelleryListingApp.model.Category;
import lombok.Data;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private int categoryId;
    private Double price;
    private Double weight;
    private String description;
    private String imageName;
}
