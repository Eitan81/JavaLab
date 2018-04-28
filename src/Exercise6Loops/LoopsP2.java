package Exercise6Loops;

import java.util.Random;

/**
 * Created by Eitan on 16/12/2017.
 */
public class LoopsP2 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(5);
        int y = random.nextInt(10);

        if (x>y){
            do {
                y++;
                System.out.println("y: " + y);
            }
            while (x > y);
            System.out.println("x = " + x + "\n y = " + y);
            }
            else if (x<y){
            do {
                x++;
                System.out.println("x: " + x);
            }
            while (x > y);
            System.out.println("x = " + x + "\n y = " + y);
        }
        else{
            System.out.println("x = " + x + "\n y = " + y);


        }
    }
}
