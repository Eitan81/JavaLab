package Exercise5Conditions;

import java.util.Random;

/**
 * Created by Eitan on 16/12/2017.
 */
public class RandomEx5p2 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(100);
        if (x > 50) {
            System.out.println("Big ! " + x);
                }
                else if (x < 50) {
                System.out.println("Small ! " + x);
                }
                else{
                    System.out.println("Bingo ! " + x);

                }
            }
    }

