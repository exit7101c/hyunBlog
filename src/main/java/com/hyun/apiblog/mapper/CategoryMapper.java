package com.hyun.apiblog.mapper;

import com.hyun.apiblog.dto.CategoryDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<CategoryDTO> getCategoryType(String type);
}
