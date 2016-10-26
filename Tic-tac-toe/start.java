
public class start {
    public static void main (String[] args)throws InterruptedException{
        char [][] map = new char [4][4];
        field.filling(map);
        boolean turn = bones.bones();
        boolean game = true;
        field.conclusion(map);
        int k =0;
        if (turn) {

            while (game ) {
                map = pc.move(map);
                if (pc.check2(map,0,0,'x')){
                    System.out.println("PC won!");
                    game = false;
                }
                k++;
                field.conclusion(map);
                if (k == 9) {
                    System.out.print("Drawn game ¯\\_(ツ)_/¯");
					break;
					
                }
                if (!game) break;
                map = pl.move(map);
                if (pc.check2(map,0,0,'o')){
                    System.out.println("You won!");
                    game = false;
                }
                field.conclusion(map);
                k++;
                if (k == 9) {
                    System.out.print("Drawn game ¯\\_(ツ)_/¯");
					break;
                }
            }
        }
        else{
            while (game ) {
                map = pl.move(map);
                if (pc.check2(map,0,0,'o')){
                    System.out.println("You won!");
                    game = false;
                }
                k++;
                field.conclusion(map);
                if (k == 9) {
                    System.out.print("Drawn game ¯\\_(ツ)_/¯");
					break;
                }
                if (!game) break;
                map = pc.move(map);
                if (pc.check2            (map,0,0,'x')){
                    System.out.println("PC won!");
                    game = false;
                }
                field.conclusion(map);
                k++;
                if (k == 9) {
                    System.out.print("Drawn game ¯\\_(ツ)_/¯");
					break;
                }


            }

        }

    }
}
