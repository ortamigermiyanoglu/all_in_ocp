package chapter18retry_.writingthreadsafecode.lockframework;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

public class LockExample2 {
    public static void printMessage(Lock lock) throws InterruptedException {
        try {
            lock.lock();
            Thread.sleep(6000);
            System.out.println("sleep in anon thread object");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();

        new Thread(() -> {
            try {
                printMessage(lock);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        Thread.sleep(3000);
        System.out.println("sleep in main");
        if (lock.tryLock(10, TimeUnit.SECONDS)){
            try {
                System.out.println("Lock obtained, entering the protected code");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Unable to acquire lock, doing something else");
        }
    }

}
