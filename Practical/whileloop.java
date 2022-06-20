package javaprograms;

public class whileloop {
	public static void main(String args[]) {
		call();
	}

	/**
	 * testing while loop in this method
	 */
	static void call() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			++i;
		}
	}
}
