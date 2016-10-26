import java.util.Random;
import java.util.concurrent.TimeUnit;
public class bones  {
    public static boolean bones ()throws InterruptedException{
        Random rnd = new Random();
        int pc,pl;
        do {
            System.out.println("PC throws bones ... ");
            TimeUnit.SECONDS.sleep(1);
            System.out.println( pc = rnd.nextInt(6) + 1);
            System.out.println("Player throws bones ...");
            TimeUnit.SECONDS.sleep(1);
            System.out.println( pl = rnd.nextInt(6) + 1);
        }
        while (pc == pl);
        if (pl > pc) {
            System.out.println("Players moves 1st");
            return false;
        }
        else {
            System.out.println("PCs moves 1 st");
            return true;
        }
    }
}
