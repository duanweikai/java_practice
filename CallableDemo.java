package com.example.demo;

import java.util.concurrent.*;

class Fib implements Callable<Long> {
    private final int n;

    public Fib(int n) {
        this.n = n;
    }

    @Override
    public Long call() throws Exception {
        return fib(n);
    }

    private static long fib(int n) {
        if (n < 2) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
}

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(10);

        Fib f = new Fib(40);
        Future<Long> submit = es.submit(f);
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        System.out.println(submit.isDone());
        Long aLong = submit.get();  // 会阻塞，直到计算完成
        System.out.println(aLong);
    }
}
