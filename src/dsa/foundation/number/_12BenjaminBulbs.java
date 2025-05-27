package dsa.foundation.number;

import java.util.Scanner;

/**
 * n number of bulbs, n time fluctuations. with every fluctuation bulbs toggle
 * state as per the number of fluctuaution. find which all bulbs are on at end.
 * initial state of bulbs is off
 * 
 * eg, for 20 bulbs, initially all are off. on 1st fluctuation, all bulbs are
 * toggled, on 2nd fluctuation, bulbs at positions divisble by 2 are toggled,
 * for 3rd fluctuation, bulbs are positions divisible by 3 are toggled
 * 
 * eventually , all bulbs that are at perfect square position are on
 */
public class _12BenjaminBulbs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number  : ");
		int num = sc.nextInt();

		for (int i = 1; i * i <= num; i++) {
			System.out.println(i * i);
		}
	}
}
