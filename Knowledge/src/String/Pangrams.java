package String;

import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		
		
		 String input = sc.nextLine();
		 input = input.toLowerCase();
         boolean flag = true;
         for(char ch = 'a';ch<= 'z';ch++){
             if(!(input.contains(String.valueOf(ch)))){
                flag = false;
                break;
             }
         }
         if(flag)
        System.out.println( "pangram");
         else
        	 System.out.println( "not pangram");
    }
	
	}


