package entity.cashiers;

import entity.Cashier;
import entity.CashierStrategy;
import entity.stratigies.DullStrategy;

/**
 * Created by Hillel2 on 12.06.2017.
 */
public class LazyCashier implements Cashier {
    @Override
    public CashierStrategy strategy(Class customerClass) {
       return new DullStrategy();
    }
}
