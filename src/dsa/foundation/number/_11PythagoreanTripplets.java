package dsa.foundation.number;

import java.util.Scanner;

public class _11PythagoreanTripplets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num 1 : ");
		int a = sc.nextInt();
		System.out.println("Enter num 2 : ");
		int b = sc.nextInt();
		System.out.println("Enter num 3 : ");
		int c = sc.nextInt();

		// to prove : h*h = p*p + b*b
		// find h , ie max num

		int max = a;
		if (b >= max) {
			max = b;
		}
		if (c >= max) {
			max = c;
		}

		if (max == a) {
			boolean isTripplet = (a * a == b * b + c * c);
			System.out.println(" is tripplet : " + isTripplet);
		} else if (max == b) {
			boolean isTripplet = (b * b == a * a + c * c);
			System.out.println(" is tripplet : " + isTripplet);
		} else {
			boolean isTripplet = (c * c == a * a + b * b);
			System.out.println(" is tripplet : " + isTripplet);
		}

	}
}
