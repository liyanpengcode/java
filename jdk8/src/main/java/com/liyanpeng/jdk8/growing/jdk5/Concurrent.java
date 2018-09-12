package com.liyanpeng.jdk8.growing.jdk5;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 并发库
 */
public class Concurrent {
    public void lock() {
        Lock lock = new ReentrantLock();
        //开启调用读锁
        lock.lock();
        try {
            System.out.println("helloword");
        } finally {
            //释放读锁
            lock.unlock();
        }
    }

    public void condition() throws InterruptedException {
        Lock clock = new ReentrantLock();
        Condition condition = clock.newCondition();
        //do something
        //执行等待10秒
        condition.await(10, TimeUnit.SECONDS);
        System.out.println("Get Result");
    }

    public void executorService() {

        //创建一个固定长度为L:3的线程池
        //还可以创建缓存的线程池,和单例的
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task is runing");
            }
        });

    }

    public void blockingDeque() {
        //创建一个长度为L:20数组的阻塞队列
        Queue<Integer> blockingDeque = new ArrayBlockingQueue<>(20);
        blockingDeque.add(2);
        blockingDeque.add(3);
        blockingDeque.add(4);
        blockingDeque.add(5);
        //偷看;窥视
        blockingDeque.peek();
    }

    public void concurrentHashMap() {
        //创建一个线程安全的map对象
        Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("Hello", 1);
        concurrentHashMap.put("World", 2);
        System.out.println(concurrentHashMap.get("Hello"));
    }

    public void copyWriteArrayList() {
        //
        List<Object> copyWriteArrayLis = new CopyOnWriteArrayList<>();

        copyWriteArrayLis.add(1);
        copyWriteArrayLis.add(2);
        copyWriteArrayLis.add(3);
        copyWriteArrayLis.add(4);
        copyWriteArrayLis.add(5);
        copyWriteArrayLis.add(6);
        copyWriteArrayLis.add(7);
        System.out.println("" + copyWriteArrayLis.size());
    }

    /**
     * semaphore:信号的意思
     */
    public void semaphore() {
        //创建一个信号对象
        Semaphore semaphore = new Semaphore(3);
        try {
            //信号调取获得方法();
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + "is working");
            Thread.sleep(1000);
            //信号对象调用发布方法()
            semaphore.release();
            System.out.println(Thread.currentThread().getName() + "is over");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
