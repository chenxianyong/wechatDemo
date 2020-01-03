package com.example.demo.dao;

import com.example.demo.model.Attachment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AttachmentMapper {
    int insert(Attachment record);

    int insertSelective(Attachment record);

    Attachment selectByMenuId(Long menuId);
}