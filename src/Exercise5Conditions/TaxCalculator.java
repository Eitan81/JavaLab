package Exercise5Conditions;

import java.util.Random;

/**
 * Created by Eitan on 16/12/2017.
 */
public class TaxCalculator {
    public static void main(String[] args) {
        Random random = new Random();

        int max = 9000000;

        int salary = random.nextInt(max);

        if((salary>0)&&(salary<23000)) {
            System.out.println("The current salary is: " + salary + "\nSalary after tax rate 10% is: " + (salary*0.9));
        }
        else if ((salary>=23000)&&(salary<50000)) {
            System.out.println("The current salary is: " + salary + "\nSalary after tax rate 20% is: " + (salary*0.8));
        }
        else if ((salary>=50000)&&(salary<100000)) {
            System.out.println("The current salary is: " + salary + "\nSalary after tax rate 30% is: " + (salary*0.7));
        }
        else if (salary>=100000) {
            System.out.println("The current salary is: " + salary + "\nSalary after tax rate 40% is: " + (salary*0.6));
        }
        else {
            System.out.println("Your salary is: " + salary );
        }

    }
}