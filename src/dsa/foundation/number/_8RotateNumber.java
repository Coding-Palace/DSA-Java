package dsa.foundation.number;

import java.util.Scanner;

public class _8RotateNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		System.out.println("Enter number of rotations ; ");
		int k = sc.nextInt();

		int nod = 0;
		int temp = num;
		while (temp != 0) {
			nod = nod + 1;
			temp = temp / 10;
		}

		// to handle rotations larger than nod, just get the remainde.
		// eg, 12345 , 5 digit number, rotations = 11, reqd actual rotations = 11%5 =1
		k = k % nod;

		// -ve rotation
		// eg, 12345, no of digits 5, rotate = -2
		// reqd : 34512
		// if, roatet = 5-2 =3, then also o/p = 34512

		if (k < 0) {
			k = nod + k; // 5 + (-2) = 5-2 = 3
		}

		int div = 1;
		int mul = 1;

		for (int i = 1; i <= nod; i++) {
			if (i <= k) {
				div = div * 10;
			} else {
				mul = mul * 10;
			}
		}

		int quo = num / div;
		int rem = num % div;

		int rot = rem * mul + quo;

		System.out.println("rotated num : " + rot);
	}

}
