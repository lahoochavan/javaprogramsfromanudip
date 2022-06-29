package com.example;

import java.util.Scanner;

public class InputuserArray {
	public static void main(String args[]) {
		int rows, cols;
		Scanner sc = new Scanner(System.in);
		System.out.println("how many rows");
		rows = sc.nextInt();
		System.out.println("how many cols");
		cols = sc.nextInt();
		int arr[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("enter the values for the array");
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}
		sc.close();
	}
}