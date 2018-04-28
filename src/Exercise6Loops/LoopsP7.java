package Exercise6Loops;

import java.util.Random;

/**
 * Created by Eitan on 16/01/2018.
 */
public class LoopsP7 {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100);
        int temp = number;
        int i;
        long factorial = 1;


        for (i=1; i<=number; i++){
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + temp + " is: " + factorial);
    }
}
