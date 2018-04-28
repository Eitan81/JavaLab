package Exercise7Arrays;

import java.util.Random;

/**
 * Created by Eitan on 16/01/2018.
 */
public class ArrayP2 {
    public static void main(String[] args) {
        Random random = new Random();
        int i;
        int max=0;
        int maxIndex=0;
        int index = 50;
        int[] number = new int[50];
        for (i = 0; i < index; i++) {
            int arr = random.nextInt(50);
            number[i] = arr;
            System.out.println(number[i]);
            if (number[i] > max){
                max = number[i];
                maxIndex = i;
            }
        }
        System.out.println("the max number is: " + max + " and the index is: " + maxIndex);
    }
}
