package com.liyanpeng.jdk8.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Atomic:原子的
 */
public class Atomic {
    //定义一个int类型的常量
    /**
     * final修饰的变量都是常量,只会被赋值一次
     */
    private static final int NUM_INCREMENTS = 1000;

    private static AtomicInteger atomicInteger =  new AtomicInteger(0);

    public static void main(String[] args) {



    }

}
