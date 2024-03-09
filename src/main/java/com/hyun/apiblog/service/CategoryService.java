package com.hyun.apiblog.service;

import com.hyun.apiblog.dto.CategoryDTO;
import com.hyun.apiblog.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private final CategoryMapper categoryMapper;

    public CategoryService(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    public CategoryDTO getCategoryType(String type) {
        return categoryMapper.getCategoryType(type);
    }
}
