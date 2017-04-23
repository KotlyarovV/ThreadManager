package com.company;

/**
 * Created by vitaly on 23.04.17.
 */
public class ThreadDispatcher {
    private ThreadDispatcher threadDispatcher;

    private ThreadDispatcher () {
    }

    public ThreadDispatcher instance() {
        if (this.threadDispatcher == null)
            this.threadDispatcher = new ThreadDispatcher();
        return threadDispatcher;
    }
}
