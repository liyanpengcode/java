package com.liyanpeng.jdk8.growing.jdk8;

import java.util.function.Supplier;

public interface DefaultAbleFactory {

    static Integer create(Supplier<Integer> supplier) {

        return supplier.get();
    }
}
