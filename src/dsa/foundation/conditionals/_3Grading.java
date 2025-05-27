package dsa.foundation.conditionals;

import java.util.Scanner;

public class _3Grading {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks : ");
		int marks = sc.nextInt();
		
		if(marks>90) {
			System.out.println("excellent");
		}else if (marks>80){
			System.out.println("Good");
		}else if(marks >70) {
			System.out.println("Fair");
		}else if(marks>60) {
			System.out.println("Meets expectations");
		}else {
			System.out.println("Below par");
		}
	}

}
