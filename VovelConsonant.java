package com.CodingClub;

import java.util.Scanner;

public class VovelConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Charachter :");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
		case'A':
		case'E':
		case'I':
		case'O':
		case'U':
			System.out.println("This is Vovel");
			break;
			default:
			System.out.println("This is consonant");
		
		}
		
	}
}
