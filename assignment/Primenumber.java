package corejava;

public class Primenumber {
	public static void main(String args[]) {
		int lahoo = 0;
		int num = 11;
		for(int i = 2; i<=num/2;i++) {
			if(num % i == 0) {
				lahoo = 1;
				break;
			} 
		}
		if(lahoo ==1)
			System.out.println("is not a prime number");
		else
			System.out.println("its a prime number");
	}
}
