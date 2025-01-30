package Problems;

import java.util.Arrays;

public class gap {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		int gap=3;
		int index=0;
		while (index<gap) {
		int sum=0;
		for (int i=index;i<arr.length;i=i+3) {
		sum = sum+arr[i];
		}
		System.out.println(sum);
		index++;
		
		}
		
	}
	}
