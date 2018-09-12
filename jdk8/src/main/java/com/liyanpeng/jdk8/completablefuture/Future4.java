package com.liyanpeng.jdk8.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 *
 */
public class Future4 {
    public static void main(String[] args) {
        try {
            String str = CompletableFuture.supplyAsync(() -> 22222).thenCompose(t -> CompletableFuture.supplyAsync(() -> t + "add")).get();
            System.err.println(str);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

}
