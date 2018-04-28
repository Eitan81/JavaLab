package Exercise7Arrays;

import java.util.Random;

/**
 * Created by Eitan on 16/01/2018.
 */
public class ArrayP3 {
    public static void main(String[] args) {
        Random random = new Random();
        int i,j;
        int max=0;
        int index = 10;
        int[] number = new int[10];
        int[] unique = new int [10];
        for (i = 0; i < index; i++) {
            int arr = random.nextInt(10);
            number[i] = arr;
            j=i;
            for (j=i; j>=0;j--){

            if (number[j] != number[i]){
                unique[i] = number[i];
            }
                System.out.println(number[i]);

            }
        }
     //   System.out.println("the array is: " + number);
      //  System.out.println("the unique array is: " + unique);
    }
}
