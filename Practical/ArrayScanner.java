package com.example;

import java.util.Scanner;

public class ArrayScanner {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many elements you want to store?");
		int m;
		m = sc.nextInt();
		int arr[] = new int[m];
		System.out.println("enter the values");
		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}
		for (int b : arr) {
			System.out.println(b);
		}
	}
}
