
public class field {
    public static char[] [] filling (char [] [] a){
        for (int i = 1; i < 4; i++){
            for (int j = 1; j < 4; j++){
                a [i][j] = '_';
            }
        }
        for (int i = 1; i < 4; i++) a[0][i] = (char) ( (int) '0' + i);
        for (int i = 1; i < 4; i++) a[i][0] = (char) ((int)'0' + i);
        a[0][0] = 'x';
        return a;
    }
    public static void conclusion (char [][] a){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(a [i][j]+ " ");
            }
            System.out.println();
        }
    }
}
