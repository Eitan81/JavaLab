package Exercise6Loops;

import java.util.Random;

/**
 * Created by Eitan on 16/01/2018.
 */
public class LoopsP6 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100000);
        int temp =number;
        int numberLength = 0;
        int sum = 0;
        int opposite = 0;
        System.out.println("The random selected number is: " + number);


        while (number > 0) {

            sum += number % 10;
            opposite = (opposite * 10) + (number % 10);
            number = number / 10;
            numberLength++;
        }
        System.out.println("The random opposite number is: " + opposite);
        if (temp == opposite) {
            System.out.println("The random selected number is a palindrome: " + opposite);
        }
            else System.out.println("The random selected number is not a palindrome: " + temp);
    }
}
