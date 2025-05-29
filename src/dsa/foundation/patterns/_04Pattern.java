package dsa.foundation.patterns;

import java.util.Scanner;

/**

* * * * * 
  * * * * 
    * * * 
      * * 
        * 

 */
public class _04Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number  : ");
		int r = sc.nextInt();

		int sp = 0;
		int st = r;

		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= st; j++) {
				System.out.print("* ");
			}
			sp++;
			st--;
			System.out.println();

		}
	}

}
