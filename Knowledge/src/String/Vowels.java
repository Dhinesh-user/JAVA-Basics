package String;

public class Vowels {

	public static void main(String[] args) {
		String s= "sElEnIum";
		s=s.toLowerCase();
		System.out.println(s);
		char c;
		String ms="";
		for(int i = 0;i<s.length();i++) {
			c=s.charAt(i);
			if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u') {
				c='x';
			    ms=ms+c;
			    }
			else
			ms=	ms+c;
				
				
		}
		System.out.println(ms);
	}

}
