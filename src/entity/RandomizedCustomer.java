package entity;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by Hillel2 on 08.06.2017.
 */
public class RandomizedCustomer extends RandomizedHuman implements Customer{
    Random random = new SecureRandom();
    @Override
    public int putGoodsOnTheLine() {
        return randomAction();
    }

    @Override
    public int payForGoods() {
        return randomAction();
    }
}
