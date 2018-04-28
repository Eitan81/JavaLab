package Exercise6Loops;

import java.util.Random;

/**
 * Created by Eitan on 16/12/2017.
 */
public class LoopsP1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randNumber = random.nextInt(10);
        int number = 0;

        do {
            number++;
            System.out.println("number: " + number);
            }
            while (number < randNumber);



    }
}
