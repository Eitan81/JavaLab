package Exercise5Conditions;

import java.util.Random;

/**
 * Created by Eitan on 15/12/2017.
 */
public class RandomEx5 {
    public static void main(String[] args) {
        Random randex5 = new Random();
        int x = randex5.nextInt(100);
        int y = randex5.nextInt(100);
        if (x < y) {
            System.out.println("The bigger value is y = " + y);
        } else if (x > y) {
            System.out.println("The bigger value is x = " + x);
        } else {
            System.out.println(" x = Y ");
        }

    }
}
