package com.liyanpeng.jdk8.growing.jdk5;

import java.util.*;

/**
 * 创建一个for循环的类
 */
public class ForEach {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
        for (int i : num) {
            System.out.println(i);
        }
        List<String> name = Arrays.asList("jack", "lock", "ribbon");
        for (String s : name) {
            System.out.println(s);
        }

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("lqwe", 11);
        linkedHashMap.put(null, null);
        linkedHashMap.put("asd", 11);
        linkedHashMap.put("1212", "111");
        System.out.println("args = [" + linkedHashMap.toString() + "]");
        Collection values = linkedHashMap.values();
        Iterator iterator = values.iterator();
        if (iterator.hasNext()) {
            System.err.println("args = [" + iterator.next() + "]");
        }


        HashMap hashMap = new HashMap();
        hashMap.put("a", null);
        hashMap.put("as", null);
        hashMap.put(null, null);
        hashMap.put(null, "nuu");
        hashMap.put(null, null);
        System.out.println("args = [" + hashMap.toString() + "]");


    }
}
