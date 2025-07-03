package sam_pac;
import java.util.Arrays;
/*
Minimum subarray sum
Input: A = [3, 1, 2, 4]
Output: 17
Explanation:
Subarrays are [3], [1], [2], [4], [3, 1], [1, 2], [2, 4], [3, 1, 2], [1, 2, 4], [3, 1, 2, 4].
Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1. Sum is 17.
 */
public class Hello {
	
	public static void main(String[] args) {
		int[] arr = {3, 1, 2, 4};int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int min = arr[i];
				for(int k=i;k<=j;k++) {
					if(min>arr[k]) {
						min = arr[k];
					}
				}
				sum = sum + min;
			}
		}
		System.out.print(sum);
	}
}
