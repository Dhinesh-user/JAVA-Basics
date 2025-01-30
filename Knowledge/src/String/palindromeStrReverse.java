package String;

import java.util.Scanner;

public class palindromeStrReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String reverse="";
        
        for(int i =0;i<string.length();i++)
        {
        	reverse=string.charAt(i)+reverse;
        }
        System.out.println(reverse);
        if(string.equals(reverse))
        	System.out.println("Palindrome");
        else
        	System.out.println("Not Palindrome");
   
	}
	
	}


