package com.example.demo.dao;

import com.example.demo.model.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectRecommendMenu(Integer bannerSize);
}