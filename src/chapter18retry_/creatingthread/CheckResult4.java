package chapter18retry_.creatingthread;

import java.util.concurrent.*;

public class CheckResult4 {

    public static void main(String[] args) {
        Callable<Integer> integerCallable = CheckResult4::getGrade;

        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();
            Future<Integer> integerFuture = service.submit(integerCallable);
        } finally {
            if (service != null) service.shutdown();
        }

        if (service!=null){
            try {
                service.awaitTermination(1, TimeUnit.MINUTES);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (service.isTerminated()){
                System.out.println("finished");
            } else {
                System.out.println("at least one task is still running");
            }

        }
    }


    public static int getGrade(){
        double randomNum =  Math.random()*100;
        System.out.println("randomNum: " + (int)(randomNum+1));
        return (int) ++randomNum;
    }
}
