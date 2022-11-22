package com.CodingClub;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {
		
//		int number = 5;
//		int sum = 0;
//		int i = 1;
//		while(i <= number) {
//			
//			sum = sum + i;
//			i++;
//		}System.out.println("Natural Number is :" + sum);
//	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number :");
	int num = sc.nextInt();
	
	int i = 1;
	int sum = 0;
	while(i <= num) {
		sum = sum + i;
		i++;
	}System.out.println("Natural Number is : " + sum);
	
	
	}
}
