package Problems;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int nums1[] = { 1, 3 };
		int nums2[] = { 2, 4 };
		int m = nums1.length;
		int n = nums2.length;
		int nums3[] = new int[m + n];
		int k = 0;
		int l = nums3.length;
		for (int i = 0; i < m; i++) {
			nums3[i] = nums1[i];
		}
		for (int i = 0; i < n; i++) {
			nums3[m + i] = nums2[i];
		}
		for (int i = 0; i < m + n; i++)
			System.out.println(nums3[i]);
		Arrays.sort(nums3);
		for (int e : nums3)
			System.out.println(e);
		if (l % 2 != 0)
			System.out.println("Median Element" + nums3[l / 2]);
		else
			System.out.println("Median Element" + (double) ((nums3[l / 2 - 1] + nums3[l / 2]) / 2.0));
	}
}
