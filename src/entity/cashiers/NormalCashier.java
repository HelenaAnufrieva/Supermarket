package entity.cashiers;

import entity.Cashier;
import entity.CashierStrategy;
import entity.customers.NormalCustomer;
import entity.stratigies.DullStrategy;
import entity.stratigies.FriendlyStrategy;

/**
 * Created by Hillel2 on 12.06.2017.
 */
public class NormalCashier implements Cashier{
    @Override
    public CashierStrategy strategy(Class customerClass) {
        if (NormalCustomer.class.isAssignableFrom(customerClass))
            return new FriendlyStrategy();
        else
            return new DullStrategy();
    }
}
