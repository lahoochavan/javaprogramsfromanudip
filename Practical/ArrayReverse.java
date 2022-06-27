package com.example;

public class ArrayReverse {
	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 6, 7 };
		System.out.println("actual array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("array in reverse order");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i] + " ");
		}
	}
}
