package dsa.foundation.conditionals;

public class _2NumComp {

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 60;

		/**
		 * way 1
		 */

		if (n1 == n2) {
			System.out.println(n1 + " is equal than " + n2);
		} else {
			if (n1 > n2) {
				System.out.println(n1 + " is greater than " + n2);
			} else {
				System.out.println(n1 + " is less than " + n2);
			}
		}

		/**
		 * way 2
		 */

		if (n1 == n2) {
			System.out.println(n1 + " is equal than " + n2);
		} else if (n1 > n2) {
			System.out.println(n1 + " is greater than " + n2);
		} else {
			System.out.println(n1 + " is less than " + n2);
		}

	}
}
