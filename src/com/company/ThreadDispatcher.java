package com.company;

/**
 * Created by vitaly on 23.04.17.
 */
public class ThreadDispatcher {
    private static ThreadDispatcher threadDispatcher;

    private ThreadDispatcher () {
    }

    public static ThreadDispatcher instance() {
        if (threadDispatcher == null)
            threadDispatcher = new ThreadDispatcher();
        return threadDispatcher;
    }
}
