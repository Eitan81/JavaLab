package Exercise5Conditions;

import java.util.Random;

/**
 * Created by Eitan on 15/12/2017.
 */
public class RandomEitan {
    public static void main(String[] args) {
        Random random1 = new Random();
        int x = random1.nextInt(100);
        int y = random1.nextInt(100);
        System.out.println("This is var x: " + x + "\n And this is Var y: "+ y);
        System.out.println("This is the sum of x + y: " + (x + y));
        System.out.println("This is the average of x and y: " + (x + y)/2);
        System.out.println("This is the remainder for " + x + "/10: " + x/10 + " " + "\n And this is the remainder for " + y + "/10: "+ y/10);
        System.out.println("The area of a rectangle: " + (x*y));
    }
}
