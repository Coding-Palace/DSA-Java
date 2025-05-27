package dsa.foundation.number;

import java.util.Scanner;

/**
 * Valid inputs, all digits present in the range of number length
 * eg, 132, 213 - valid
 * 129 - invalid, since 3 is missing
 * 
 * Inverse : 
 * Input : 81456273
 * 8 - pos 8
 * 1 - pos 7
 * 4 - pos 6
 * 5 - pos 5
 * 6 - pos 4
 * 2 - pos 3
 * 7 - pos 2
 * 3 - pos 1
 * 
 * Inverse : 
 * 
 * pos 8 - 8
 * pos 1 - 7
 * pos 4 - 6
 * pos 5 - 5
 * pos 6 - 4
 * pos 2 - 3
 * pos 7 - 2
 * pos 3 - 1
 * 82456137 - inverse
 * 
 *  ex 2 : 
 *  2143
 *  2 - pos 4
 *  1 - pos 3
 *  4 - pos 2
 *  3 - pos 1
 *  
 *  inverse:
 *  pos 2 - 4
 *  pos 1 - 3
 *  pos 4 - 2
 *  pos 3 - 1
 *  2143 - inverse
 */
public class _7InverseOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		int inverse = 0;
		int pos = 1;
		while (num != 0) {
			int digit = num % 10;
			inverse = inverse + pos * (int) Math.pow(10, digit - 1);
			pos++;
			num = num / 10;
		}

		System.out.println("inverse is : " + inverse);
	}

}
