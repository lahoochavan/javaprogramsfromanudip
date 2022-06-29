package com.example;

public class MultiArray {
	public static void main(String args[]) {
		int arr[][] = new int[2][4];
		arr[0][0] = 7;
		arr[0][1] = 8;
		arr[0][2] = 9;
		arr[0][3] = 10;
		arr[1][0] = 11;
		arr[1][1] = 12;
		arr[1][2] = 13;
		arr[1][3] = 14;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
	}
}
