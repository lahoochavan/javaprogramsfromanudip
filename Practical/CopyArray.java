package corejava;

public class CopyArray {
	public static void main(String args[]) {
		int arr1[] =new int[] {10,78,65,43,43};
		int arr2[] =new int[arr1.length];


		for(int i = 0 ;i<5;i++)
		{
			arr2[i] = arr1[i];
		}
		System.out.println("Original array");
		for(int i= 0 ; i<5;i++) {
			System.out.println(arr1[i]+ "  ");
		}
		System.out.println("Duplicate array");
		for(int i=0; i<5;i++) {
			System.out.println(arr2[i]+ "  ");

		}
	}
}
