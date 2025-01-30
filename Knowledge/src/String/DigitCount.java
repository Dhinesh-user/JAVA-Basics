package String;

public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s="9845";
  String a="";
  int k=3;
 
  for( int i=0;i<k;i++) {
	  a =a+s;
	  
  }
  System.out.println(a);
  int d =Integer.parseInt(a);
  int sum =0;
  int re=0;
  System.out.println(d);
  while(d<10) {
	  re = d%10;
	  sum += re;
	  d/=10;
  }
System.out.println(sum);
	}

}
