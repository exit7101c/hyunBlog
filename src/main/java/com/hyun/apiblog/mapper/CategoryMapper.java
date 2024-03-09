package com.hyun.apiblog.mapper;

import com.hyun.apiblog.dto.CategoryDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {
    CategoryDTO getCategoryType(String type);
}
