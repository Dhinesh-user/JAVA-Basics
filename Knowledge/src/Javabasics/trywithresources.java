package Javabasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class trywithresources {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int num =0;
		try(BufferedReader r = new BufferedReader(new InputStreamReader(System.in))){
			num = Integer.parseInt(r.readLine());
			
			System.out.println(num/0);
		} catch (ArithmeticException e) {
			
			System.out.println(e);
			e.printStackTrace();
		}
		
	}

}
