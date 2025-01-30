package Problems;

import java.math.BigInteger;

public class BigIntegerEx{
	
	private static BigInteger sum(String n){
        BigInteger result = BigInteger.ZERO;
        for(int i = 0; i < n.length(); i++){
            result = result.add(BigInteger.valueOf(
                Character.getNumericValue(n.charAt(i))));
        }
        return result;
    }

   public static int superDigit(String n, int k) {
   // Write your code here
       BigInteger p = sum(n).multiply(BigInteger.valueOf(k));
       
       while(p.compareTo(BigInteger.TEN) >= 0){
           p = sum(String.valueOf(p));
       }
       
       return p.intValue();
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "9435";
		int k = 4;
		int sum =0;
		System.out.println(BigIntegerEx.superDigit(s, k));
		for(int i =0;i<s.length();i++) {
			
		}

	}

}
