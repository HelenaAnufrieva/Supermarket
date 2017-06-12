package entity.stratigies;

import entity.CashierStrategy;
import entity.Customer;

/**
 * Created by Hillel2 on 12.06.2017.
 */
public class FriendlyStrategy implements CashierStrategy {
    public static final int FRIENDLY_COEFFICIENT = -2;
    @Override
    public int communicate(Customer customer) {
        System.out.println("Friendly");
        return customer.buyThings() + FRIENDLY_COEFFICIENT;
    }
}
