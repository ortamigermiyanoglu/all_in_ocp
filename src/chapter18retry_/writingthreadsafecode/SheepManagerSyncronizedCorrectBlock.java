package chapter18retry_.writingthreadsafecode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManagerSyncronizedCorrectBlock {
    private int sheepCount = 0;
    private void incrementAndReport(){
        synchronized (this){
            System.out.println("a thread: "+ (++sheepCount));
        }
    }

    private synchronized void incrementAndReportSyncMethod(){
        System.out.println("a thread: "+ (++sheepCount));
    }


    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newFixedThreadPool(20);
            SheepManagerSyncronizedCorrectBlock sheepManager = new SheepManagerSyncronizedCorrectBlock();
            for (int i = 0; i < 10; i++) {
                service.submit(() -> sheepManager.incrementAndReport());
            }
        } finally {
            if (service!=null) service.shutdown();
        }

    }

}
