package chapter18retry_.creatingthread;

import java.util.concurrent.*;

public class Scheduled {

    public static void main(String[] args) {
        ScheduledExecutorService service = null;

        try {
            service = Executors.newSingleThreadScheduledExecutor();
            Runnable task1 = () -> System.out.println("Hello Zoo");
            Callable<String> task2 = () -> {
                System.out.println("Monkey");
                return "Monkey";
            };
            ScheduledFuture<?> scheduledFuture1 = service.schedule(task1,10, TimeUnit.SECONDS);
            ScheduledFuture<String> scheduledFuture2 = service.schedule(task2, 10, TimeUnit.SECONDS);
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
