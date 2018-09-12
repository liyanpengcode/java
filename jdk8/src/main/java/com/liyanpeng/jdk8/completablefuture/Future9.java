package com.liyanpeng.jdk8.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 *
 */
public class Future9 {
    private static CompletableFuture<Integer> m1() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 233;
        });
    }

    private static CompletableFuture<Integer> m2() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 8888;
        });
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        m1().acceptEither(m2(), t -> {
            System.out.println("t" + t);
        }).get();
    }
}
