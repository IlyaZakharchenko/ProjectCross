import java.util.Scanner;
public class pl {
    public static char[][] move(char [] [] map){
        while(1 == 1) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Choose column ");
            int x = scan.nextInt();
            System.out.print("Choose line ");
            int y = scan.nextInt();
            if (map[y][x] == '_') {
                map[y][x] = 'o';
                return map;
            }
            System.out.println("Cell is already used! ");
        }
    }
}
