package Problems;

public class sortArrDes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {2,1,0,3,0,2};
		int temp;
		for(int i =0;i<arr.length;i++) {
			for(int j= i+1;j<arr.length;j++) {
			if(arr[j]>arr[i]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		}
		for(int a :arr)
			System.out.println(a);
	}
	}


