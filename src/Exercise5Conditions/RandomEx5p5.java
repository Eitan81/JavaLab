package Exercise5Conditions;

import java.util.Random;

/**
 * Created by Eitan on 16/12/2017.
 */
public class RandomEx5p5 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt();
        int y = random.nextInt();
        int z = random.nextInt();

        if ((x > y) && (x>z)){
            System.out.println("x = " + x);
        }
        else if ((y>z) && (y>x)){
            System.out.println("y = " + y);
        }
        else{
            System.out.println("z = " + z);
        }
    }
}
