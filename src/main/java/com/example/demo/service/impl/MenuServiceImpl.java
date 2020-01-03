package com.example.demo.service.impl;

import com.example.demo.dao.AttachmentMapper;
import com.example.demo.dao.IngredientsInventoryMapper;
import com.example.demo.dao.MenuMapper;
import com.example.demo.dto.MenuDto;
import com.example.demo.model.Attachment;
import com.example.demo.model.Menu;
import com.example.demo.service.MenuService;
import com.example.demo.utils.CopyUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author chenxianyong
 * @description
 * @data 2020/1/2 13:37
 */
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;
    @Autowired
    private AttachmentMapper attachmentMapper;
    @Autowired
    private IngredientsInventoryMapper ingredientsInventoryMapper;

    @Override
    public Map<String, Object> getIndex(Integer bannerSize, Integer pageNum, Integer pageSize) {
        //根据喜欢数取前三、相同取点赞，相同取排序，相同取id
        List<Menu> menuList = menuMapper.selectRecommendMenu(bannerSize).stream().limit(bannerSize).collect(Collectors.toList());
        List<MenuDto> recommendMenuList = CopyUtils.copyList(menuList, MenuDto.class);
        //循环查询清单和附件
        if (CollectionUtils.isEmpty(recommendMenuList)) {
            return null;
        }
        recommendMenuList.forEach(recommendMenu -> {
            Long menuId = recommendMenu.getId();
            Attachment attachment = attachmentMapper.selectByMenuId(menuId);
        });
        return null;
    }
}
