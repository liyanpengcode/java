package com.liyanpeng.jdk8.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 *
 */
public class Future2 {
    public static void main(String[] args) {
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.err.println("开始执行运算");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int a = 1 / 0;
            System.err.println("执行结束");
            return 2233;
        });
        try {
            Integer integer = completableFuture.whenComplete((a, b) -> {
                System.err.println("result" + a);
                System.err.println("Executor" + b);
            }).exceptionally(e -> {
                System.err.println(e.getMessage());
                return 666;
            }).get();
            System.err.println(integer);
        } catch (InterruptedException e) {

        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

}
