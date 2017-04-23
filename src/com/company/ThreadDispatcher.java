package com.company;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by vitaly on 23.04.17.
 */
public class ThreadDispatcher {
    private static ThreadDispatcher threadDispatcher;
    private ExecutorService executorService;
    private ThreadsMonitor threadsMonitor = ThreadsMonitor.instance();


    private ThreadDispatcher () {
        executorService = Executors.newCachedThreadPool();
    }

    public static ThreadDispatcher instance() {
        if (threadDispatcher == null)
            threadDispatcher = new ThreadDispatcher();
        return threadDispatcher;
    }

    public void addTask (IWorker task) {
        executorService.submit(task);
        threadsMonitor.addIWorker(task);
    }
}
