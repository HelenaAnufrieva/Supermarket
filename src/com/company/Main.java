package com.company;

import entity.*;
import entity.cashiers.LazyCashier;
import entity.cashiers.NormalCashier;
import entity.customers.AnotherCustomer;
import entity.customers.RandomizedCustomer;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Register register = new Register(randomCashier());
        /*Register anotherRegister = new Register(new NormalCashier());
        Random random = new Random();
        for (int i = 0; i < random.nextInt(100); i++)
            register.newCustomer(new RandomizedCustomer());*/

        for (int i = 0; i < 10; i++)
            register.newCustomer(randomCustomer());
        register.run();
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
