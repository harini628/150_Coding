package sam_pac;
import java.util.Arrays;
/*
Max contiguous Subarray

Input:[-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output:6
Explanation:-2
-2,1
-2,3,-1 so on
 */
public class Hello {
	

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}
}
