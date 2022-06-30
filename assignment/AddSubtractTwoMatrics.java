import java.util.Scanner;
public class AddSubtractTwoMatrics {
	public static void main(String args[]) {
		Scanner ac = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rows = ac.nextInt();
		System.out.println("enter the number of cols");
		int cols = ac.nextInt();
		int[][] a = new int[rows][cols];
		int[][] b = new int[rows][cols];
		System.out.println("enter the elements in first matrix ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j] = ac.nextInt();
			}
		}
		System.out.println("enter the elements in second matrix");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				b[i][j] = ac.nextInt();
			}
		}
	}
}
