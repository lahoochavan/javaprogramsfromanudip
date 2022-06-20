/*
 * @Author Amitava
 */
package com.example;

//to test command line parameter
class CommandLineTest {

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.println("i is " + i + " and the value is " + args[i]);
		}

	}

}
