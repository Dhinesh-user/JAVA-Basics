package Problems;

import java.util.Scanner;

public class Multiplicationofotherelements_Array {
//	WAJP to return a string having reversed array elements multiplication of 
//	other elements and reversed token
//I/P : 
//arr:{1,4,3}
//tok: 65qwerty
//O/P :
//arr:{12,3,4}
//final O/P: 4-3-21-ytrewq56
	public static String Arraychallenge(int[] arr, String tok) {
		String ans="";
		String Rev_tok="";
		String Rev_ans="";
		int n=arr.length;
		int prod[] = new int[n];
		int temp=1;
		int a=0;
//		for reversing token
		for(int i =tok.length()-1;i>=0;i--)
			Rev_tok=Rev_tok+tok.charAt(i);
		System.out.println(Rev_tok);
//		To create array having 1 in each element
		for(int j=0;j<n;j++) 
			prod[j]=1;
		
		for(int f:prod)
		System.out.print("prod:"+f);
		System.out.println();
		
		for(int i=0;i<n;i++) {
			prod[i]=temp;
			temp*=arr[i];
		}
		for(int q:prod)
			System.out.print("prod1:"+q+" ");
			System.out.println();
			
//		Initialize temp as 1 
		temp =1;
		for(int i=n-1;i>=0;i--) {
			prod[i]*=temp;
			temp*=arr[i];
		}
		for(int i=0;i<prod.length;i++) {
			ans=ans+String.valueOf(prod[i]);
			if(a!=prod.length-1) {
				ans =ans+"-";
			a++;}
		}
		System.out.println("len"+ans.length());
		for(int i =ans.length()-1;i>=0;i--)
			Rev_ans=Rev_ans+ans.charAt(i);
		Rev_ans=Rev_ans+"-"+Rev_tok;
		System.out.println(Rev_ans);
		return Rev_ans;
	}


	public static void main(String[] args) {

		
		int arr[]= new int[3];
		Scanner s= new Scanner(System.in);
		String tok = s.nextLine();
		for(int i=0;i<3;i++) {
		arr[i] = s.nextInt();
		}
		for(int k:arr)
			System.out.println(k);
		
		System.out.println(tok);
		System.out.println(Arraychallenge(arr,tok));
		
		
	}

	
	

	
}
