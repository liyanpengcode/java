package com.liyanpeng.jdk8.growing.jdk8;

public class TypeInference<T> {

    public static <T> T defaultValue() {

        return null;
    }


    public T getOrDefault(T value, T defaultValue) {
        return value != null ? value : defaultValue;
    }

    public static void main(String[] args) {
        final TypeInference<String> typeInference = new TypeInference<>();
        String orDefault = typeInference.getOrDefault("24", TypeInference.defaultValue());
        System.err.println(orDefault);
    }
}
