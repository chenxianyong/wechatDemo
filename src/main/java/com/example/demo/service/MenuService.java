package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author chenxianyong
 * @description
 * @data 2020/1/2 13:38
 */
@Service
public interface MenuService {
    Map<String, Object> getIndex(Integer bannerSize, Integer pageNum, Integer pageSize);
}
