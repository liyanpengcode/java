package com.liyanpeng.jdk8.growing.jdk5;

import java.util.Arrays;
import java.util.List;

/**
 * 变长参数
 */
public class VarArgs {
    public static List<String> asList(String[] args) {
        return Arrays.asList(args);
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "B", "c");
    }
}

