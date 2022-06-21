package com.example;

public class Palindromenumber {
	public static void main(String[] args) {

		int i = 545;
		int rev = 0;
		while (i != 0) {
			int t = i % 10;
			rev = 10 * rev + t;
			i = i / 10;
		}
		if (rev == 545)
			System.out.println(545 + "is palindrome Number");
		else
			System.out.println(545 + "is not a palindrome Number");

	}
}
