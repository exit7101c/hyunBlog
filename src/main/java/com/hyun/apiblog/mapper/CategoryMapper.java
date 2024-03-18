package com.hyun.apiblog.mapper;

import com.hyun.apiblog.dto.CategoryDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<CategoryDto> getCategoryType(String type);
}
