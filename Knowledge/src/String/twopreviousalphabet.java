package String;

public class twopreviousalphabet {
	
//	I/P - CDEF
//	O/P - ABCD

	public static void main(String[] args) {
		 String s= "CDEF";
		 char c[]= s.toCharArray();
		 String ans = "" ;

		 for(int i = 0;i<c.length;i++) {
			 ans = ans +(char)(c[i]-2);
			 
		 }
		 System.out.println(ans);
	}
	

}
