package chapter18.concurrencyapi;

public class ExecutorServiceCommonMethods {
    /*          Method Name                             Description
    * void execute(Runnable command)                    executes a Runnable task at some point in the future
    *
    *Future<?> submit(Runnable task)                    executes a Runnable task at some point in the future
    *                                                   and returns a Future representing the task
    *
    * <T> Future<T> submit (Callable<T> task)           executes a Callable task at some point in the future
    *                                                   and returns a Future representing the pending results of
    *                                                   the task
    *
    *
    * <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException
    *
    *  executes the given tasks and waits for all task to complete. Returns a List of Future instances, in the
    *  same order they were in the original collection
    *
    * <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException
    * executes the given tasks and waits for at least one to complete. Returns a Future instance for complete task
    * and cancels any unfinished tasks
    * */




}
