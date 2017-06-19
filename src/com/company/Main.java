package com.company;

import entity.*;
import entity.cashiers.LazyCashier;
import entity.cashiers.NormalCashier;
import entity.customers.AnotherCustomer;
import entity.customers.RandomizedCustomer;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();

        /*ExecutorService pool = Executors.newCachedThreadPool(new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setName("name");
                thread.setPriority(10);
                thread.setDaemon(true);
                return thread;
            }
        }); // factory
*/

        ExecutorService pool = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++)
            pool.submit(main.newRegister());

        /*register.run();*/
        Thread.currentThread().sleep(1);
        pool.shutdownNow();
        System.out.println("all done");
    }

    private Register newRegister()
    {
        Register register = new Register(randomCashier());
        for (int i = 0; i < 10; i++)
            register.newCustomer(randomCustomer());
        return  register;
    }

    private static Customer randomCustomer()
    {
        if(new Random().nextBoolean())
            return new RandomizedCustomer();
        else
            return new AnotherCustomer();
    }

    private static Cashier randomCashier()
    {
        if (new Random().nextBoolean())
            return new LazyCashier();
        else return new NormalCashier();
    }
}
