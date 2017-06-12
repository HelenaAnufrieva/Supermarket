package entity;

/**
 * Created by Hillel2 on 08.06.2017.
 */
public interface Cashier {

    CashierStrategy strategy(Class customerClass);
    /*
    int beepTheGoods();

    int callAmount();

    int giveChangeAndReceipt();*/

}
