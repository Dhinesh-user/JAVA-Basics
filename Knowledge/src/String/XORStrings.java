package String;

import java.util.Scanner;

public class XORStrings {

	public static String xor(String s1,String s2){
        String result = " ";
        StringBuilder sb = new StringBuilder();
       for(int i=0;i<s1.length();i++){
           char c1= s1.charAt(i);
           char c2= s2.charAt(i);
           System.out.println(c1+""+c2);
           char xc = (char)(c1^c2);
           System.out.println(xc);
           sb.append(xc);
       }
       return sb.toString();
   }
   public static void main(String[] args) {
       /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner s  = new Scanner(System.in);
       String  s1 = s.nextLine();
       String  s2 = s.nextLine();
       System.out.println(XORStrings.xor(s1,s2));
       
   }

}
