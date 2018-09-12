package com.liyanpeng.jdk8.stream.lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 */
public class Example1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello World");
        Stream<String> stream = list.stream();
        Object[] objects = stream.toArray();
        System.out.println(objects[0]);
        Stream<String> stringStream = Arrays.stream(new String[]{"hello", "world"});
        stringStream.forEach(s -> System.out.println(s));

        Stream<String> stream1 = Stream.of("learn", "java8");
        if (stream1 != null) {
            long count = stream1.count();
            System.err.println(count);
        }


    }
}
