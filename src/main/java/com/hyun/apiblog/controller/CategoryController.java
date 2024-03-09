package com.hyun.apiblog.controller;

import com.hyun.apiblog.dto.CategoryDTO;
import com.hyun.apiblog.dto.UserDTO;
import com.hyun.apiblog.service.CategoryService;
import com.hyun.apiblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hb/category")
public class CategoryController {
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/{type}")
    public CategoryDTO getCategoryType(@PathVariable String type) {
        return categoryService.getCategoryType(type);
    }

}
