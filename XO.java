import java.util.Scanner;

public class XO {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		final int SIZE = 4;
		boolean trigger = false;
		int player = 0;
		int count = 0;
		int res = 0;
		String [][] a = new String[SIZE][SIZE];
		for (int i = 1; i < SIZE; i++) {
			for (int j = 1; j < SIZE; j++) {				
				a[i][j] = ". ";
				System.out.print(a[i][j]);
			}
			System.out.println();
		}						//Вывод изначального поля
		while (!trigger) {
			player++;
			for (int i = 0; i < i + 2; i++) {
				System.out.println("Enter x coordinate");
				int x = sc.nextInt();
				System.out.println("Enter y coordinate");
				int y = sn.nextInt(); 
				if (a[y][x] == ". ") {
					if (player % 2 != 0) {
						a[y][x] = "X ";
					}
					else {
						a[y][x] = "O ";
					}
					break;
				}
				else {
					System.out.println("The cell is occupied, try another one");
					continue;
				}
			}					//Ввод координат игрока
			for (int i = 1; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					System.out.print(a[i][j]);
				}
				System.out.println();
			}					//Вывод поля
			count = 0;
			for (int i = 1; i < SIZE - 1; i++) {
				if (a[i][i] == a[i + 1][i + 1] && a[1][1] != ". ") {
					count++;
				}
				if (count == (SIZE - 1)) {
					res = count;
					break;
				}
			}					//Проверка по диагонали слева направо
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE - 1; j++) {
					count = 0;
					if (a[i][j] == a[i][j + 1] && a[i][j] != ". ") {
						count++;
					}
					if (count == SIZE - 1) {
						res = count;
						break;
					}
				}
			}					//Проверка построчно
			count = 0;
			for (int i = 1; i < SIZE - 1; i++) {
				if ((a[i][SIZE - i - 1] == a[i + 1][SIZE - 2 - i]) && a[1][1] != ". ") {
					count++;
					System.out.println(count);
				}
				if (count == SIZE - 1) {
					res = count;
					break;
				}
			}					//Проверка по диагонали справа налево
			count = 0;
			for (int j = 0; j < SIZE; j++) {
				for (int i = 0; i < SIZE - 1; i++) {
					if (a[i][j] == a[i + 1][j] && a[i][j] != ". ") {
						count++;
					}
					if (count == SIZE - 1) {
						res = count;
						break;
					}
				}
			}					//Проверка по столбцам
			if (res == (SIZE - 1)) {
				trigger = true;
			}
		}
		if (player % 2 != 0) {
			System.out.println("Player 1 wins!");
		}
		else {
			System.out.println("Player 2 wins!");
		}
	}
}