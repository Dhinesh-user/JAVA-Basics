package Problems;

public class PrimeNumber {

	public static void main(String[] args) {
		 int n=28;
		 if(n==0||n==1)
			 System.out.println("not prime");
		 if(n%2==0)
			 System.out.println("not prime");
		 else {
		 for(int i=3;i<n/2;i=i+2) {
			
			 if(n%i==0)
				 System.out.println("not prime");
		 }
		 System.out.println("prime");
		 }

	}

}
