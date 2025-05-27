package dsa.foundation.number;

import java.util.Scanner;

public class _3Fibbonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter number : ");
		int num = sc.nextInt();

		int a = 0;
		int b = 1;
		for (int i = 0; i < num; i++) {
			System.out.println(a);
			int c = a + b;
			a = b;
			b = c;
		}
	}

}
