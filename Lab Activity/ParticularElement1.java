import java.util.Scanner;
public class ParticularElement1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of element is:");
		int n = sc.nextInt();
		
	    int i=0;
	    int arr[] = new int[n];
	    System.out.println("Enter the numbers: ");
	    for ( i = 0; i < n; i++) 
	    	arr[i] = sc.nextInt();
	        
	    for (i = 0; i < n; i++) 
	    	System.out.println("arr[" + i + "] = " + arr[i]);
	    
	    {
	    	System.out.println("Enter the particular element you want to search:");
			int row=sc.nextInt();
			for(i=0; i<arr.length; i++) {
				if(arr[i]==row) {
					System.out.println(arr[i]+" element is present in array");
					break;
					
				}
			}
			
			System.out.println("This element is not present in array");

		}
	}

}
