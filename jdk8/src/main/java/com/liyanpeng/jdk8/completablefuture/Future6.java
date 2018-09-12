package com.liyanpeng.jdk8.completablefuture;

import java.util.concurrent.CompletableFuture;

/**
 *
 */
public class Future6 {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> 9999999).thenAcceptBoth(CompletableFuture.supplyAsync(() -> "77777"), (a, b) -> {
            System.out.println("A" + a);
            System.out.println("B" + b);
        });
    }
}
