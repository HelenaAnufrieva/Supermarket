package entity;

import java.util.Random;

/**
 * Created by Hillel2 on 08.06.2017.
 */
public class RandomizedHuman {
    private final Random random = new Random();

    protected int randomAction()
    {
        return random.nextInt(15);
    }
}
