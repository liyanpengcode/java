package com.liyanpeng.jdk8.growing.jdk5;

import java.util.HashMap;
import java.util.Map;

/**
 * 泛型使用
 *
 * @param <T>
 */
public class Generic<T> {
    public T getById(Integer id) {
        return null;
    }

    public static void main(String[] args) {
        //创建一个集合容器
        Map<String,Integer> map = new HashMap<>();

        Generic<Long> generic = new Generic<>();
    }
}
