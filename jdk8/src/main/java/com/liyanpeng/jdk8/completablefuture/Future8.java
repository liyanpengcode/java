package com.liyanpeng.jdk8.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 *
 */
public class Future8 {
    public static void main(String[] args) {
        try {
            String string = CompletableFuture.supplyAsync(() -> 222).thenCombine(CompletableFuture.supplyAsync(() -> "11111"), (a, b) -> {
                System.out.println("a" + a);
                System.out.println("b" + b);
                return a + b;
            }).get();
            System.out.println(string);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
