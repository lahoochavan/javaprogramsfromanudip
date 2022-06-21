package com.example;

public class Fibonacciseries {
	public static void main(String args[]) {
		int lahoo = 11, l1 = 0, l2 = 1;
		System.out.print("Fibonacci Series of " + lahoo + " numbers:");

		for (int i = 1; i <= lahoo; ++i) {
			System.out.print(l1 + " ");
			int sumOfPrevTwo = l1 + l2;
			l1 = l2;
			l2 = sumOfPrevTwo;
		}
	}
}
