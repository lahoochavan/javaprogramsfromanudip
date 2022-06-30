
public class Oddeven {
	public static void main(String args[]) {
		int a []=	{1,6,4,8,5};
		System.out.println("even number");
		for(int i=0;i<5;i++) {
			if(a[i]%2==0)
				System.out.println(a[i]);

		}
		System.out.println("odd number");
		for(int i=0;i<5;i++) {
			if(a[i]%2!=0)
				System.out.println(a[i]);

			}

}
}