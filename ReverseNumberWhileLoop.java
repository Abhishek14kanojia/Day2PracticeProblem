package com.CodingClub;

import java.util.Scanner;

public class ReverseNumberWhileLoop {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number :");
			int n = sc.nextInt();
			
			while (n > 0) {
				int r = n % 10;
				System.out.print(r);
					n = n / 10;
			}
			
			
		}
}
