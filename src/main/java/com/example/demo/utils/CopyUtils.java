package com.example.demo.utils;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author chenxianyong
 * @description
 * @data 2020/1/2 18:26
 */
public class CopyUtils {
    public static <T> T copyProperties(Object original, Class<T> clazz) {
        if (original == null) {
            return null;
        }
        T target = null;
        try {
            target = clazz.newInstance();
            BeanUtils.copyProperties(original, target);

        } catch (Exception e) {
        }
        return target;
    }

    public static void copyProperties(Object original, Object dest) {
        try {
            BeanUtils.copyProperties(original, dest);

        } catch (Exception e) {
        }
    }

    public static <T> List<T> copyList(Collection<?> original, Class<T> clazz) {
        if (original == null) {
            return null;
        }
        List<T> results = new ArrayList<T>();
        for (Object each : original) {
            results.add(copyProperties(each, clazz));
        }
        return results;
    }
}
