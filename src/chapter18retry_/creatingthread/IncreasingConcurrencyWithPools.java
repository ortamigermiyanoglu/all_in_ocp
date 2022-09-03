package chapter18retry_.creatingthread;

public class IncreasingConcurrencyWithPools {
    /**
     *          Method                        Description
     * newSingleThreadExecutor                  Creates a single-threaded executor that uses a single worker
     *                                          thread operating off an unbounded queue. Results are processed
     *                                          sequentially in the order in which they are submitted
     *
     * newSingleThreadScheduledExecutor         Creates a single-threaded executor that can schedule commands to run
     *                                          after a given delay or execute periodically
     *
     *
     * newCachedThreadPool()                    Creates a thread pool that creates new threads as needed but
     *                                          will reuse previously constructed threads when they are available.
     *
     *
     * newFixedThreadPool(int)                  Creates a fixed thread pool that reuses a fixed number of threads
     *                                          operating off a shared unbounded queue
     *
     *
     * newScheduledThreadPool(int)              Created a thread pool that can schedule commands to run after a given delay
     *                                          or to execute periodically
     *
     */
}
