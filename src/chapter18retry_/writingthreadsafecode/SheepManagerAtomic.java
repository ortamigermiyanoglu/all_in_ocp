package chapter18retry_.writingthreadsafecode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManagerAtomic {
    private AtomicInteger sheepCount = new AtomicInteger(0);

    private void incrementAndReport(){
        System.out.println("a thread: "+ (sheepCount.incrementAndGet()));
    }

    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newFixedThreadPool(20);
            SheepManagerAtomic sheepManager = new SheepManagerAtomic();
            for (int i = 0; i < 10; i++) {
                service.submit(() -> sheepManager.incrementAndReport());
            }
        } finally {
            if (service!=null) service.shutdown();
        }
    }
}
