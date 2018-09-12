package com.liyanpeng.jdk8.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 *
 */
public class Future10 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long l = System.currentTimeMillis();
        CompletableFuture.anyOf(m1(), m2()).thenRun(() -> {
            System.out.println(System.currentTimeMillis() - l);
        }).get();
    }

    private static CompletableFuture<Integer> m1() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 222332;
        });
    }

    private static CompletableFuture<Integer> m2() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 333;
        });
    }
}
