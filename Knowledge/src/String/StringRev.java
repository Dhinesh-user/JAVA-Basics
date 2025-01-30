package String;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
		String a="sun";
		 char ch;
		 for(int i=0;i<a.length();i++){
		 ch = a.charAt(i);
		 rev=ch+rev;
		}
//		 for(int i=a.length()-1;i<=0;i--)
			 
		System.out.println(rev);
		if(a.equals(rev)){
		System.out.println("true");
		}
		else{
	    System.out.println("false");
		}

	}

}
