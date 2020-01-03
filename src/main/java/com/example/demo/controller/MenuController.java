package com.example.demo.controller;

import com.example.demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author chenxianyong
 * @description
 * @data 2020/1/2 13:04
 */
@RestController
@RequestMapping("menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public Map<String, Object> index(Integer bannerSize, Integer pageNum, Integer pageSize) {
        return menuService.getIndex(bannerSize, pageNum, pageSize);
    }
}
