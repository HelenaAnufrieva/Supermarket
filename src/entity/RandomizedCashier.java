package entity;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by Hillel2 on 08.06.2017.
 */
public class RandomizedCashier extends RandomizedHuman implements Cashier {
    @Override
    public int beepTheGoods() {
        return randomAction();
    }

    @Override
    public int callAmount() {
        return randomAction();
    }

    @Override
    public int giveChangeAndReceipt() {
        return randomAction();
    }
}
