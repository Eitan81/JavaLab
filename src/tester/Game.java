package tester;

import java.util.Random;

/**
 * Created by Eitan on 17/01/2018.
 */
public class Game {
    public static void main(String[] args) {
        int macabbi = 0, hapoel = 0 ,scoreM = 0, scoreH = 0,i;
        String status = null;
        System.out.println("Tournament between: \n" + "Team" + ": " + "Macabi");
        System.out.println("Goalkeeper: " + "David");
        System.out.println("Defensive: " + "Avi");
        System.out.println("Defensive: " + "Koby");
        System.out.println("Offensive: " + "Eran");
        System.out.println("Offensive: " + "Meir");

        System.out.println("\n" + "Team" + ": " + "Hapoel");
        System.out.println("Goalkeeper: " + "Awat");
        System.out.println("Defensive: " + "Logen");
        System.out.println("Defensive: " + "Scott");
        System.out.println("Offensive: " + "Jon");
        System.out.println("Offensive: " + "Atar");

        Random random = new Random();

        for(i=1; i<=5; i++){

            scoreM = random.nextInt(3);
            scoreH = random.nextInt(3);

            if (scoreM > scoreH ){
                macabbi += 3;
                status = "Macabbi wins!";
            }
            else if (scoreM == scoreH ){
                hapoel += 1;
                macabbi += 1;
                status = "Draw!";
            }
            else {
                hapoel += 3;
                status = "Hapoel wins!";
            }
            if (hapoel==7 || macabbi==7){
                i+=5;
            }
            System.out.println("Game #" + i +": " + "Team +  VS  + Team => " + scoreM + " : " + scoreH + ", "+  status );
            System.out.println("Score: " + "Team " + scoreM + " Team  => " + scoreH  );
            scoreH = 0;
            scoreM = 0;
        }

        if (macabbi > hapoel ){
            status = "Macabbi wins!";
        }
        else if (macabbi == hapoel ){
            status = "Draw!";
        }
        else {
            status = "Hapoel wins!";
        }

        System.out.println(status + " Tournament points for Macabi = " + macabbi + " Tournament points for Hapoel = " + hapoel);


    }
}
