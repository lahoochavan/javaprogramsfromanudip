package lab2;

public class PrimeNumber {
	private static void prime() {
		int i,m=0,flag=0;      
		int n=7;//it is the number to be checked    
		m=n/2;      
		if(n==0||n==1){  
			System.out.println(n+" is not prime number");  
			//print prime number
		}
		else{  
			for(i=2;i<=m;i++){      
				if(n%i==0){      
					System.out.println(n+" is not prime number");  
					//print not a prime number
					flag=1;      
					break;      
				}      
			}      
			if(flag==0)  { System.out.println(n+" is prime number");}}
	}//end of else  
	public static void main(String args[]) {
		prime();
	}
}















