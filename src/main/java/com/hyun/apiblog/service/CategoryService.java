package com.hyun.apiblog.service;

import com.hyun.apiblog.dto.CategoryDto;
import com.hyun.apiblog.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryMapper categoryMapper;

    @Autowired
    public CategoryService(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    public List<CategoryDto> getCategoryType(String type) {
        return categoryMapper.getCategoryType(type);
    }
}
