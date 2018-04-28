package Exercise6Loops;

import java.util.Random;

/**
 * Created by Eitan on 16/01/2018.
 */
public class LoopsP5 {


        public static void main(String[] args) {
            Random random = new Random();
            int number = random.nextInt(10000);
            int numberLength = 0;
            int sum = 0;
            int opposite = 0;
            System.out.println("The random selected number is: " + number);
            int firstDigit = Integer.parseInt(Integer.toString(number).substring(0, 1));
            System.out.println("The first left digit is: " + firstDigit);

            while (number > 0) {

                sum += number % 10;
                opposite = (opposite * 10) + (number % 10);
                number = number / 10;
                numberLength++;
            }

            System.out.println("The sum of number's digits is: " + sum);
            System.out.println("The numberLength is: " + numberLength);
            System.out.println("The random opposite number is: " + opposite);
        }
}




