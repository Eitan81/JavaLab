package Exercise5Conditions;

import java.util.Random;

/**
 * Created by Eitan on 16/12/2017.
 */
public class SalaryRaiserEx5p4 {
    public static void main(String[] args) {
        Random random = new Random();
        int Min = 5000;
        int Max = 6000;
        int salary = random.nextInt(Max-Min)+Min;
        int newSalary = 0;

        if((salary*1.1)<Max) {
            System.out.println("The current salary is: " + salary + "\nCongratulation you get an 10% upgrade and your new salary is: " + (salary*1.1));
        }
        else {
            System.out.println("Your salary is: " + salary );
        }
    }
}
