package Exercise7Arrays;

import java.util.Random;

/**
 * Created by Eitan on 16/01/2018.
 */
public class ArrayP1 {
    public static void main(String[] args) {
        Random random = new Random();
        int i;
        float avg, sum=0;
        int[] number = new int[10];
        for(i=0; i<10;i++){
            int arr = random.nextInt(100);
            number[i]=arr;
            System.out.println(number[i]);
            sum += number[i];
           if (i == 9) {
                avg = sum / (i + 1);
                System.out.println("The sum for array is: " + sum);
                System.out.println("The average for array is: " + avg);
            }

        }
    }
}
