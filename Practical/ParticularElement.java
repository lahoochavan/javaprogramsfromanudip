import java.util.Scanner;
public class ParticularElement {
	public static void main(String args[]) {
		Scanner acid = new Scanner(System.in);

		System.out.println("Enter the particular element you want to search:");
		int row=acid.nextInt();
		int arr[]=new int [3];
		arr[0]=12;
		arr[1]=11;
		arr[2]=7;

		for(int i=0; i<arr.length; i++) {
			if(arr[i]==row) {
				System.out.println(arr[i]+" element is present in array");
				break;

			}
		}

		System.out.println("This element is not present in array");
	}
}
