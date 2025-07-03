package sam_pac;
import java.util.Arrays;
/*
Maximum subarray sum
Input: arr[] = {2, 3, -8, 7, -1, 2, 3}
Output: 11
Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.
 */
public class Hello {
	
	public static void main(String[] args) {
		int[] arr = {2, 3, -8, 7, -1, 2, 3};int max = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum = 0;
				for(int k=i;k<=j;k++) {
					sum = sum+arr[k];
				}
				if(sum>max) {
					max = sum;
				}
			}
		}
		System.out.println(max);
		
	}
}
