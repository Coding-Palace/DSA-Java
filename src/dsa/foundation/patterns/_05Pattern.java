package dsa.foundation.patterns;

import java.util.Scanner;

/**

    * 
  * * * 
* * * * * 
  * * * 
    * 

 */
public class _05Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int r = sc.nextInt();

		int sp = r / 2;
		int st = 1;

		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= st; j++) {
				System.out.print("* ");
			}
			if (i <= r / 2) {
				sp--;
				st = st + 2;
			} else {
				sp++;
				st = st - 2;
			}
			System.out.println();
		}
	}
}
