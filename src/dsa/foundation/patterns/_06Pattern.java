package dsa.foundation.patterns;

import java.util.Scanner;

/**
* * *   * * * 
* *       * * 
*           * 
* *       * * 
* * *   * * * 
 */
public class _06Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number  : ");
		int num = sc.nextInt();

		int st = num / 2 + 1;
		int sp = 1;

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= st; j++) {
				System.out.print("* ");
			}

			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}

			for (int j = 1; j <= st; j++) {
				System.out.print("* ");
			}

			if (i <= num / 2) {
				st = st - 1;
				sp = sp + 2;
			} else {
				st = st + 1;
				sp = sp - 2;
			}
			System.out.println();
		}
	}

}
