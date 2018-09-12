package com.liyanpeng.jdk8.growing.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * lambda 表达式
 */
public class Lambda {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(15);
        list.add(14);
        list.add(13);
        list.add(12);
        list.add(11);
        Arrays.asList("121", "111", "110").forEach(System.out::println);

    }
}
