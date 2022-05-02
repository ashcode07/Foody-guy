package com.sheryians.major.DTO;

import lombok.Data;


@Data
public class ProductDTO {
    private Long id;
    private String name;
    private int categoryId;
    private double price;
    private double weight;
    private String description;
    private String ImageName;

}
