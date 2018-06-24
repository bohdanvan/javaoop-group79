package com.bvan.javaoop.lessons11_12.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author bvanchuhov
 */
public class BarWithExecutorService {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        ExecutorService executorService =
                Executors.newFixedThreadPool(2);

        for (int drinkerId = 1; drinkerId <= 3; drinkerId++) {
            Runnable drinker = new Drinker(drinkerId);
            executorService.submit(drinker);
        }

        executorService.shutdown();

        ThreadUtils.println("Bar is closed");
    }
}
