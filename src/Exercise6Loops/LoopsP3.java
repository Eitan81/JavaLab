package Exercise6Loops;

import java.util.Random;

/**
 * Created by Eitan on 16/12/2017.
 */

public class LoopsP3 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(10);
        int y = 0;

        do {
            if ((y % 2 == 0) && (y < x)) {
                System.out.println(y);
                y++;
            } else {
                y++;
            }
        }
        while (y < x);


    }
}


