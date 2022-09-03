package chapter18retry_.writingthreadsafecode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManagerSyncronizedThreadCreation {

    private int sheepCount = 0;

    private void incrementAndReport(){
        System.out.println("a thread: "+ (++sheepCount));
    }

    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newFixedThreadPool(20);
            SheepManagerSyncronizedThreadCreation sheepManager = new SheepManagerSyncronizedThreadCreation();
            for (int i = 0; i < 10; i++) {
                synchronized (sheepManager){
                    service.submit(() -> sheepManager.incrementAndReport());
                }
            }
        } finally {
            if (service!=null) service.shutdown();
        }
    }


}
