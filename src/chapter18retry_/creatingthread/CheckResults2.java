package chapter18retry_.creatingthread;

import java.util.concurrent.*;

public class CheckResults2 {
    public static int counter = 0;

    public static void main(String[] args) {

        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 500; i++) {
                    CheckResults2.counter++;
                }
            });

            result.get(10, TimeUnit.SECONDS);
            System.out.println("reached");
        } catch (TimeoutException timeoutException){
            System.out.println("not reached in time");
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
