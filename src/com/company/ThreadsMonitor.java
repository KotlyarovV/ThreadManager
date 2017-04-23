package com.company;

import com.sun.org.apache.xalan.internal.utils.FeatureManager;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/**
 * Created by vitaly on 23.04.17.
 */
public class ThreadsMonitor implements IWorker {
    List<IWorker> iWorkers = new ArrayList<>();
    public static ThreadsMonitor threadsMonitor;
    private boolean work;

    private ThreadsMonitor() {}

    @Override
    public boolean isAlive() {
        return Thread.currentThread().isAlive();
    }

    @Override
    public String getName() {
        return Thread.currentThread().getName();
    }

    @Override
    public int getId() {
        return (int)Thread.currentThread().getId();
    }

    @Override
    public void shoutDown() {
        work = false;
    }

    @Override
    public void run() {
        work = true;
        while (work)
            for (IWorker iWorker : iWorkers)
                System.out.println(iWorker.getName() + " " + iWorker.getId());
    }

    public void addIWorker (IWorker iWorker) {
        iWorkers.add(iWorker);
    }

    public static ThreadsMonitor instance() {
        if (threadsMonitor == null)
            threadsMonitor = new ThreadsMonitor();
        return threadsMonitor;
    }
}
