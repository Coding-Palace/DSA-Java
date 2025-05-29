package dsa.foundation.patterns;

import java.util.Scanner;

/**

        * 
      * * 
    * * * 
  * * * * 
* * * * *
 
*/
public class _03Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number  : ");
		int r = sc.nextInt();

		int sp = r - 1;
		int st = 1;
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= st; j++) {
				System.out.print("* ");
			}
			sp--;
			st++;
			System.out.println();
		}

	}

}
