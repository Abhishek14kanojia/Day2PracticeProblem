package com.CodingClub;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b) {
			if(a > c)
			System.out.println(a);
			else
			System.out.println(c);
		}else {
			if(b > c)
				System.out.println(b);
			else
				System.out.println(c);
		}
		
		int sum1 = a+b*c;
		System.out.println(sum1);
		
		int sum2 = c+a/b;
		System.out.println(sum2);
	
		int sum3 = a%b+c;
		System.out.println(sum3);
	
		int sum4 = a*b+c;
		System.out.println(sum4);
	}
}
