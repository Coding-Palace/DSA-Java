package dsa.foundation.number;

import java.util.Scanner;

public class _10PrimeFactorization {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();

		// Brute Force
//		for (int div = 2; div <= n; div++) {
//			while (n % div == 0) {
//				n = n / div;
//				System.out.println(div);
//			}
//		}

		// opimized
		for (int div = 2; div * div <= n; div++) {
			while (n % div == 0) {
				n = n / div;
				System.out.println(div);
			}
		}
		if (n != 1) {
			System.out.println(n);
		}
	}

}
