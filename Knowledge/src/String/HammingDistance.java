package String;

import java.util.Scanner;

public class HammingDistance {
//	WAJP to return difference in characters of a 2 string in String array
//	 I/P:
//		 str:{zxcv,zxas}
//    O/P:
//   	 ans:2
//    Expl:
//   	 cv and as are the 2 character diff
	public static int Hamming(String s[]) {
		String s1=s[0];
		String s2=s[1];
		int h=0;
		if(s1.length()!=s2.length())
			return 0;
		else 
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)!=s2.charAt(i))
					h++;
			}
		return h;
		
	}
	public static void main(String[] args) {

		String[] s = new String[2];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<s.length;i++) {
		s[i]= sc.nextLine();
		}
		for(String a:s)
		System.out.println(a);
		System.out.println(Hamming(s));
		
	}

	

}
