package corejava;

public class LargestNumber {
	public static void main(String args[]) {
		double n1 = 4.5, n2 = 3.9, n3 = 5.5, n4 = 8.7;

		if(n1 > n2 & n1> n3 & n1 > n4 ) {
			System.out.println(n1 + " is the largest number.");

		}
		else if (n2 > n1 & n2> n3 & n2 > n4) 
		{
			System.out.println(n2 + " is the largest number.");
		}
		else if (n3 > n1 & n3> n2 & n3 > n4) {
			System.out.println(n3 + " is the largest number.");
		}
		else {
			System.out.println(n4 + " is the largest number.");
		}
	}
}