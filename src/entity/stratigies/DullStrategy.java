package entity.stratigies;

import entity.CashierStrategy;
import entity.Customer;

/**
 * Created by Hillel2 on 12.06.2017.
 */
public class DullStrategy implements CashierStrategy {
    private final static int DULL_COEFFICIENT = 2;
    @Override
    public int communicate(Customer customer) {
        System.out.println("Dull");
        return customer.buyThings() + DULL_COEFFICIENT;
    }
}
