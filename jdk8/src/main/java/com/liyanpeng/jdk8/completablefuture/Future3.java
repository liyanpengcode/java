package com.liyanpeng.jdk8.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 *
 */
public class Future3 {
    public static void main(String[] args) {
        try {
            String result = CompletableFuture.supplyAsync(() -> 233).thenApply(String::valueOf).get();
            System.err.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

}
