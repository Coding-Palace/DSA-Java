package dsa.foundation.number;

import java.util.Scanner;

public class _2PrintAllPrimesInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range start from : ");
		int low = sc.nextInt();
		System.out.println("Enter the range end at : ");
		int high = sc.nextInt();

		for (int num = low; num <= high; num++) {
			int count = 0;
			for (int i = 2; i * i <= num; i++) {
				if (num % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(num);
			}
		}

	}
}
