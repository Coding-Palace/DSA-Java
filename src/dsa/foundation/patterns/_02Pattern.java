package dsa.foundation.patterns;

import java.util.Scanner;

/**

* * * * * 
* * * * 
* * * 
* * 
* 

 */
public class _02Pattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int r = sc.nextInt();

		for (int i = r; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
