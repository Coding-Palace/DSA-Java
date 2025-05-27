package dsa.foundation.number;

import java.util.Scanner;

public class _1Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of turns : ");
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int num = sc.nextInt();
			// boolean isPrime = checkIfPrime(num);
			boolean isPrime = checkIfPrimeOptimized(num);
			if (isPrime) {
				System.out.println(num + " is prime");
			} else {
				System.out.println(num + " is not prime");
			}

		}
	}

	private static boolean checkIfPrimeOptimized(int num) {
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Divisible only by 1 or itself
	 * 
	 * @param num
	 * @return
	 */
	private static boolean checkIfPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
