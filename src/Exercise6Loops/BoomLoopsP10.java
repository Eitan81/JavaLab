package Exercise6Loops;

/**
 * Created by Eitan on 16/01/2018.
 */
public class BoomLoopsP10 {
    public static void main(String[] args) {
        int index = 100, boom = 7, i;
        for (i=0; i<=index; i++){
            if ((((i > 10) && (i % boom) == 0)) || ((i % 10) == boom) || ((i > 10) && (((i / 10) % boom) == 0))){
                System.out.println("BOOM");
            }
            else System.out.println(i);
        }
    }
}
