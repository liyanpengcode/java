package com.liyanpeng.jdk8.completablefuture;

import java.util.concurrent.*;

/**
 * 2018/5/5
 */

public class Future1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建两个线程对象
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(10);
            return 100;
        });
        while (!future.isDone()) {
            try {
                TimeUnit.MILLISECONDS.sleep(110);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Integer integer = future.get();
        System.err.println(integer);
    }

}
