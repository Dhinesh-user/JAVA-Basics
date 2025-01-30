package Problems;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr = new int[] {2,1,0,3,0,2};
      
      int n = arr.length;
      int[] temp = new int[n];
      int j =0;
      
//      Arrays.sort(arr);
//      for(int a:arr)
//      System.out.println(a);
      for(int i=0;i<arr.length;i++) {
    	  if(arr[i]!=0) {
    		  temp[j++]= arr[i];
    		  
    	  }
    	  while(j<n) {
    		 temp[j++] = 0; 
    	 
    	  }
    	 
      }
      for(int i=0;i<n;i++) 
    	  arr[i]=temp[i];;
		for(int a :arr)
			System.out.println(a);
		
		
	}

}
