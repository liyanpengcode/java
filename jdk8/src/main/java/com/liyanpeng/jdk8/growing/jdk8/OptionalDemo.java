package com.liyanpeng.jdk8.growing.jdk8;

import java.util.Optional;

/**
 * Optional
 */
public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> fullName = Optional.ofNullable(null);

        System.out.println("Full name is set?" + fullName.isPresent());
        System.out.println("Full name :" + fullName.orElse("none"));

        System.out.println(fullName.map(s -> "Hey" + s + "!").orElse("Hey Stranger"));


        Optional<String> firstName = Optional.of("LiXianSheng");
        System.out.println("first name is set ?" + firstName.isPresent());
        System.out.println("First name :" + firstName.orElseGet(()->  "[none]"));


        System.err.println(firstName.map(s -> "Hey" + s + "!").orElse("Hey" +
                "Stranger!"));
    }
}
