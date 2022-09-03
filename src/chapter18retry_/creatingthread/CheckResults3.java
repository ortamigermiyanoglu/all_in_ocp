package chapter18retry_.creatingthread;

import chapter14.puttingalltogetherforgenerics.C;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class CheckResults3 {
    private static int grade1;
    private static int grade2;
    private static int grade3;


    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;

        Callable<Integer> task1 = CheckResults3::getGrade;
        Callable<Integer> task2 = CheckResults3::getGrade;
        Callable<Integer> task3 = CheckResults3::getGrade;

        try {
            service = Executors.newSingleThreadExecutor();

            List<Callable<Integer>> tasks = List.of(task1, task2, task3);


            List<Future<Integer>> futures = service.invokeAll(tasks);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         finally {
            if (service != null) service.shutdown();
        }

//        service.submit(task3); will throw rejected exception
//        if awaitTermination is called before shutdown then that thread will wait the full timeout value sent with await termination

        if (service!=null){
            service.awaitTermination(1, TimeUnit.MINUTES);
            if (service.isTerminated()) System.out.println("finished");
            else System.out.println("at least one task is still running");
        }


    }

    public static int getGrade(){
        double randomNum =  Math.random()*100;
        System.out.println("randomNum: " + (int)(randomNum+1));
        return (int) ++randomNum;
    }
}
