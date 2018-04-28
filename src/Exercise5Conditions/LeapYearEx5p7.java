package Exercise5Conditions;

import java.util.Random;

/**
 * Created by Eitan on 16/12/2017.
 */
public class LeapYearEx5p7 {
    public static void main(String[] args) {
        Random random = new Random();

        int year = random.nextInt(10000);

        if (((year%4==0)&&(year%100 !=0))||((year%400==0)&&(year%100 ==0))){
            System.out.println("year " + year + " is a leap year");
        }
        else{
            System.out.println("year " + year + " is not a leap year");
        }

    }
}
