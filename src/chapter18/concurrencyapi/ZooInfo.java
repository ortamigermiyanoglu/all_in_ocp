package chapter18.concurrencyapi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZooInfo {

    /*
    * Java includes concurrency api to handle the complicated work of managing threads for you
    *
    * The Concurrency API includes ExecutorService interface, which defines services that create
    * and manage threads for you
    *
    * You first obtain an instance of an ExecutorService interface, and then you send the service tasks
    * to be processed
    * */

    /*
     * a thread executor creates a non daemon thread on the first task that is executed, so failing to call
     * shutdown() will result in your application never terminating
     * */

    /*
    * jf a new task is submitted to thread executor while it's shutting down
    * a RejectedExecutionException   will be thrown
    * */


    /*
    *  be aware of the differences between shutdown() and shutdownnow()
    *
    * */

    public static void main(String[] args) {
        ExecutorService executorService = null;
        Runnable task1 = () -> {
            System.out.println("printing zoo inventory");
        };

        Runnable task2 = () -> {
            for (int i=0; i<3; i++){
                System.out.println("print record: "+i);
            }
        };

        try {
            executorService = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            executorService.execute(task1);
            executorService.execute(task2);
            executorService.execute(task1);
            System.out.println("end");
        } finally {
            if (executorService != null) executorService.shutdown();
        }
    }
}
