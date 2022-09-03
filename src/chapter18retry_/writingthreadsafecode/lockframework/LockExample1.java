package chapter18retry_.writingthreadsafecode.lockframework;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample1 {

    public static void prıntMessage(Lock lock){
        try {
            lock.lock();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        new Thread( () -> prıntMessage(lock)).start();
        if (lock.tryLock()){
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