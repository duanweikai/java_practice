package com.example.demo;

class MyThreadLocal extends ThreadLocal<Long> {
    @Override
    protected Long initialValue() {
        return 9L;
    }
}

public class ThreadLocalDemo {
    public static ThreadLocal<Long> threadLocal = new MyThreadLocal();

    static class MyThread extends Thread {
        @Override
        public void run() {
            threadLocal.set(180L);
            System.out.println(Thread.currentThread().getName() + ":" + threadLocal.get());
        }
    }

    static class MyThread2 extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ":" + threadLocal.get());
        }

    }

    public static void main(String[] args) throws InterruptedException {
        threadLocal.set(18L);
        someMethod();
        MyThread t1 = new MyThread();
        t1.start();
        t1.join();

        MyThread2 t2 = new MyThread2();
        t2.start();
    }

    private static void someMethod() {
        System.out.println(Thread.currentThread().getName() + ":" + threadLocal.get());
    }
}
