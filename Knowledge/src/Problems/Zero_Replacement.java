package Problems;




public class Zero_Replacement {
//	Move Zero to first of the array 
//	I/P [1,0,2,1,0,3]
//	O/P [0,0,1,2,1,3]

	public static void main(String[] args) {
		int[] arr = {0,1,0,3,0,2};
		int temp;
		int index=0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				
				for(int j=i;j>index;j--) {
					temp =arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					
				}
				index++;
		}
	}
   for (int a:arr)
   System.out.print(a);
	}
	}
