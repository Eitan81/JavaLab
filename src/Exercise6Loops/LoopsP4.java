package Exercise6Loops;

import java.util.Random;

/**
 * Created by Eitan on 17/12/2017.
 */
public class LoopsP4 {
    public static void main(String[] args) {
        Random random = new Random();

        int den = random.nextInt(100);
        int max = random.nextInt(100);


        do {
            if ((den % 2 == 0) && (den < max)) {
                System.out.println(den);
                den++;
            } else {
                den++;
            }
        }
        while (den < max);


    }
}
