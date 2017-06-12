package entity.customers;

import entity.Customer;
import entity.RandomizedHuman;

import java.security.SecureRandom;
import java.util.Random;

public class RandomizedCustomer extends RandomizedHuman implements NormalCustomer {
    Random random = new SecureRandom();

    @Override
    public int buyThings() {
        return randomAction();
    }
    /*@Override
    public int putGoodsOnTheLine() {
        return randomAction();
    }

    @Override
    public int payForGoods() {
        return randomAction();
    }*/
}