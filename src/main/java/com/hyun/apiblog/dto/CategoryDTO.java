package com.hyun.apiblog.dto;

import lombok.Data;

@Data
public class CategoryDTO {
    private final int categoryId;
    private final String categoryCode;
    private final String categoryName;
    private final String categoryType;

    public CategoryDTO(int categoryId, String categoryCode, String categoryName, String categoryType) {
        this.categoryId = categoryId;
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
