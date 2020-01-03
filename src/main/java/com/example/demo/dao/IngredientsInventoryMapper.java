package com.example.demo.dao;

import com.example.demo.model.IngredientsInventory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IngredientsInventoryMapper {
    int insert(IngredientsInventory record);

    int insertSelective(IngredientsInventory record);
}