

import java.util.Scanner;

public class Gugudan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("gugudanfrom:");
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		printDan(i);
		printDan(i);

	}

	public static void printDan(int i) {
		for (int j = 1; j < 9; j++) {
			int k= i * j;
			System.out.println(i + " x" + j + " =" + k);
		}
	}

}
