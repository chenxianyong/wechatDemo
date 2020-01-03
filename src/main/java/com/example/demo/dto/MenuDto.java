package com.example.demo.dto;

import com.example.demo.model.Attachment;
import com.example.demo.model.IngredientsInventory;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author chenxianyong
 * @description
 * @data 2020/1/2 18:21
 */
@Data
public class MenuDto {
    private Long id;

    private Integer del;

    private Date createTime;

    private String chef;

    private String title;

    private Long laud;

    private Long favorite;

    private String description;

    private Integer spendTime;

    private Integer degree;

    private String step;

    private String knack;

    private Integer sort;

    private Attachment attachment;

    private List<IngredientsInventory> ingredientsInventoryList;
}
