package corejava;

public class Add2Array {
public static void main(String args[]) {
	int a [] = {1,3,3,4,5};
	int b[]  = {3,4,4,32,9};
	int c[] = new int [a.length];
	for(int i =0; i<a.length;i++) {
		c[i] = a[i] + b[i];
		System.out.print(c[i]+ " ");
		
	}
}
}
