package Exercise6Loops;

import java.util.Random;

/**
 * Created by Eitan on 16/01/2018.
 */
public class LoopsP9 {
    public static void main(String[] args) {
        Random random = new Random();
        int index = random.nextInt(50);
        long fibonacci = 0, num1=0, num2=1;
        int i;
           System.out.println("The fibonacci of " + index + " is: " + num2);
        for (i=1; fibonacci<=index; i++){
            fibonacci = num1 + num2;
           if (fibonacci <= index) {
                System.out.println("The fibonacci of " + i + " is: " + fibonacci);
          }
            num1 = num2;
            num2 = fibonacci;
        }
     //   System.out.println("The fibonacci of " + i + " is: " + fibonacci);
    }
}

