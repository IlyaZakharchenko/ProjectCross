import java.util.Random;
public class pc {
    public static char [][] move (char [][] map){
        Random rnd = new Random();
        if (map[2][2] == '_') {
            map[2][2] = 'x';
            return map;
        }
        else {
            for (int i = 1; i <= 3; i++){
                for (int j = 1; j <= 3; j++){
                    if (check(map,i,j,'x')) {
                        map[i][j] = 'x';
                        System.out.println("moving " + j + i);
                        return map;
                    }
                }
            }
            for (int i = 1; i <=3 ; i++){

                for (int j = 1; j <= 3; j++){
                    if (check(map,i,j,'o')) {
                        map[i][j] = 'x';
                        System.out.println("moving " + j + i);
                        return map;
                    }
                }
            }
            if ((map[2][1] != 'x')&&(map[1][2] != 'x')&&(map[2][3] != 'x')&&(map[3][2] != 'x')){
                int x = rnd.nextInt(4)+1;
                switch (x) {
                    case 1:
                        if (map[2][1] == '_') {
                            map[2][1] = 'x';
                            System.out.println("moving " + 1 + 2);
                            return map;
                        }
                    case 2:
                        if (map[1][2] == '_') {
                            map[1][2] = 'x';
                            System.out.println("moving " + 2 + 1);
                            return map;
                        }
                    case 3:
                        if (map[2][3] == '_') {
                            map[2][3] = 'x';
                            System.out.println("moving " + 3 + 2);
                            return map;
                        }
                    case 4:
                        if (map[3][2] == '_') {
                            map[3][2] = 'x';
                            System.out.println("moving " + 2 + 3);
                            return map;
                        }
                }
            }
            if (map[2][1]=='x') {
                if (map[1][1] == '_') map[1][1]='x';
                else {
                    if (map[3][1] == '_') map[3][1] = 'x';
                }
                System.out.println("moving " );
                return map;
            }
            if (map[1][2]=='x') {
                if (map[1][1] == '_') map[1][1]='x';
                else {
                    if (map[1][3] == '_') map[1][3] = 'x';
                }
                System.out.println("moving " );
                return map;
            }
            if (map[2][3]=='x') {
                if (map[1][3] == '_') map[1][3]='x';
                else {
                    if (map[3][3] == '_') map[3][3] = 'x';
                }
                System.out.println("moving " );
                return map;
            }
            if (map[3][2]=='x') {
                if (map[3][3] == '_') map[3][3]='x';
                else {
                    if (map[3][1] == '_') map[3][1] = 'x';
                }
                System.out.println("moving " );
                return map;

            }
            for (int i = 1; i < 4; i++){
                for (int j = 1; j < 4; j++){
                    if (map[i][j] == '_') {
                        map[i][j] = 'x';
                        System.out.println("moving " + j + i);
                        return map;
                    }
                }
            }
            System.out.println("chto to powlo ne tak");
            return map;

        }

    }
  public static boolean check (char [][] map, int y, int x, char a){
      boolean check = false;
      char [] [] maps = new char [4][4];

      for (int i = 1; i < 4; i++){
          for (int j = 1; j < 4; j++){
              maps [i][j] = map[i][j];
          }
      }
      if (map[y][x] != '_'){
          return false;
      }
      else {
          maps[y][x] = a;
      }
      for (int i = 1; i <= 3; i++){

          if ((maps[i][1] == maps[i][2]) && (maps[i][1] == maps[i][3]) &&(maps[i][1] == a) ){

              return true;
          }
      }

      for (int i = 1; i <= 3; i++){
          if ((maps[1][i] == maps[2][i]) && (maps[1][i] == maps[3][i]) &&(maps[1][i] == a) ){
              return true;
          }
      }
      if ((maps[1][1] == maps[2][2]) && (maps[1][1] == maps[3][3])&&(maps[1][1] == a) ){
          return true;
      }
      if ((maps[1][3] == maps[2][2]) && (maps[3][1] == maps[2][2])&&(maps[1][3] == a) ){
          return true;
      }
      return false;
  }
    public static boolean check2 (char [][] maps, int y, int x, char a){
        for (int i = 1; i <= 3; i++){
            if ((maps[i][1] == maps[i][2]) && (maps[i][1] == maps[i][3]) &&(maps[i][1] == a) ){
                return true;
            }
        }

        for (int i = 1; i <= 3; i++){
            if ((maps[1][i] == maps[2][i]) && (maps[1][i] == maps[3][i]) &&(maps[1][i] == a) ){
                return true;
            }
        }
        if ((maps[1][1] == maps[2][2]) && (maps[1][1] == maps[3][3])&&(maps[1][1] == a) ){
            return true;
        }
        if ((maps[1][3] == maps[2][2]) && (maps[3][1] == maps[2][2])&&(maps[1][3] == a) ){
            return true;
        }
        return false;
    }
}
