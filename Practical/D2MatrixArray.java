import java.util.Scanner;

public class D2MatrixArray {
	public static void main(String args[]) {
		Scanner lahoo = new Scanner(System.in);
		int num1, num2, res;
		System.out.println("Enter the number");
		num1=lahoo.nextInt();
		System.out.println("Enter the num2");


		num2=lahoo.nextInt();
		res=num1+num2;
		System.out.println("sum of two number is:"+res);

		lahoo.close();
	}
}
