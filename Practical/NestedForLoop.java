
public class NestedForLoop {
	public static void main(String args[]) {
		for (int row = 1; row <= 5; row++) {
			for (int coloum = 1; coloum <= row; coloum++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
