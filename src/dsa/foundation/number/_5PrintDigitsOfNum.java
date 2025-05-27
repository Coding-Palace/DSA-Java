package dsa.foundation.number;

import java.util.Scanner;

public class _5PrintDigitsOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();

		// get number of digits
		int digits = 0;
		int temp = num;
		while (temp != 0) {
			digits++;
			temp = temp / 10;
		}

		// get divisor , 10^
		int div = (int) Math.pow(10, digits - 1);

		// quotient is digit, new num = remainder, adjust div by 10
		while (div != 0) {
			int digit = num / div;
			System.out.println(digit);
			num = num % div;
			div = div / 10;
		}
	}
}
