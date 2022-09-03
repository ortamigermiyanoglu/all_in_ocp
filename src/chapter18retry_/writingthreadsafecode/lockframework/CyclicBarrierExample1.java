package chapter18retry_.writingthreadsafecode.lockframework;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample1 {
    private void removeLions(){
        System.out.println("Removing lions");
    }
    private void cleanPen(){
        System.out.println("Cleaning the pen");
    }
    private void addLions(){
        System.out.println("Adding lions");
    }
    public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
        removeLions();
        try {
            c1.await();
            cleanPen();
            c2.await();
            addLions();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newFixedThreadPool(4);
            var manager = new CyclicBarrierExample1();
            var c1 = new CyclicBarrier(4);
            var c2 = new CyclicBarrier(4, ()-> System.out.println("***Pen Cleaned***"));
            for (int i = 0; i < 4; i++) {
                service.submit(() -> manager.performTask(c1, c2));
            }
        } finally {
            if (service!=null) service.shutdown();
        }
    }

}
