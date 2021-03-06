package entity;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by Hillel2 on 08.06.2017.
 */
public class Register implements Runnable {

    private final Cashier cashier;
    private final Queue<Customer> queue = new LinkedList<>();

    public Register(Cashier cashier) {
        this.cashier = cashier;
    }

    public void newCustomer(Customer customer)
    {
        queue.add(customer);
    }

    public void run()
    {
        int numberOfCustomers = 0;
        int totalTime = 0;
        Customer customer;
        while ((customer = queue.poll()) != null)
        {

//            if (new Random().nextBoolean())
//                newCustomer(customer);
            CashierStrategy strategy = cashier.strategy(customer.getClass());
            totalTime += strategy.communicate(customer);
            /*totalTime += customer.putGoodsOnTheLine();
            totalTime += cashier.beepTheGoods();
            totalTime += cashier.callAmount();
            totalTime += customer.payForGoods();
            totalTime += cashier.giveChangeAndReceipt();*/
            numberOfCustomers++;
        }
        System.out.println("It was " + numberOfCustomers + " customers and it took " + totalTime + " second");
    }

}
