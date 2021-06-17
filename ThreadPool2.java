package ThreadPool2;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Worker extends Thread {
    private Runnable firstTask;
    private BlockingQueue<Runnable> queue;

    public Worker(Runnable firstTask, BlockingQueue<Runnable> queue) {
        this.firstTask = firstTask;
        this.queue = queue;
    }

    @Override
    public void run() {
        firstTask.run();
        firstTask = null;

        while (!Thread.interrupted()) {
            try {
                Runnable task = queue.take();
                task.run();
            } catch (InterruptedException exc) {
                break;
            }
        }
    }
}

public class ThreadPool2 {
    private Thread[] workers;
    private int currentCoreSize;
    private int corePoolSize;
    private BlockingQueue<Runnable> queue;

    public ThreadPool2(int corePoolSize) {
        workers = new Thread[corePoolSize];
        currentCoreSize = 0;
        this.corePoolSize = corePoolSize;
        queue = new ArrayBlockingQueue<>(10);
    }

    public void execute(Runnable task) throws InterruptedException {
        if (currentCoreSize < corePoolSize) {
            Thread t = new Worker(task, queue);
            t.start();

            workers[currentCoreSize] = t;
            currentCoreSize++;
        } else {
            queue.put(task);
        }
    }

    public void shutdown() throws InterruptedException {
        // 要求关闭所有线程
        for (int i = 0; i < currentCoreSize; i++) {
            Thread thread = workers[i];
            thread.interrupt();
        }

        for (int i = 0; i < currentCoreSize; i++) {
            Thread thread = workers[i];
            thread.join();
        }
    }
}
