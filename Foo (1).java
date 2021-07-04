package leetcode.p1114;

public class Foo {
    private int step = 1;

    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        synchronized (this) {
            while (step != 1) {
                this.wait();
            }
        }
        printFirst.run();
        synchronized (this) {
            step = 2;
            this.notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        synchronized (this) {
            while (step != 2) {
                this.wait();
            }
        }
        printSecond.run();
        synchronized (this) {
            step = 3;
            this.notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
        synchronized (this) {
            while (step != 3) {
                this.wait();
            }
        }
        printThird.run();
        synchronized (this) {
            step = 1;
            this.notifyAll();
        }
    }
}
