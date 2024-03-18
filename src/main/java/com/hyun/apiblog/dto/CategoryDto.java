package com.hyun.apiblog.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CategoryDto {
    private final int categoryId;
    private final String categoryCode;
    private final String categoryName;
    private final String categoryType;
    private final String url;

    public CategoryDto(int categoryId, String categoryCode, String categoryName, String categoryType, String url) {
        this.categoryId = categoryId;
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
        this.categoryType = categoryType;
        this.url = url;
    }
}
