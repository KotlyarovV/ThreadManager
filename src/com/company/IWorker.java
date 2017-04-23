package com.company;

/**
 * Created by vitaly on 23.04.17.
 */
public interface IWorker extends Runnable {
    int getId();
    String getName();
    boolean isAlive();
    void shoutDown();
}
