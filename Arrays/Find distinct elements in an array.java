package sam_pac;
import java.util.Arrays;
/*
Find distinct elements in an array
Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
Output: {12, 10, 9, 45, 2}
Explanation:
Given an integer array arr[], print all distinct elements from this array. The given
array may contain duplicates and the output should contain every element only
once.
 */
public class Hello {
	public static int count(int[] arr,int n) {
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n)c++;
		}
		return c;
	}
	public static int[] remove_zeros(int[] arr) {
		int c = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)c++;
		}
		int sol[] = new int[arr.length-c];
		for(int i=0;i<sol.length;i++) {
			sol[i] = arr[i];
		}
		return sol;
	}
	
	public static void main(String[] args) {
		int[] arr = {12, 10, 9, 45, 2, 10, 10, 45};
		int found[] = new int[arr.length];int x=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<found.length;j++) {
				if(arr[i]==found[j]) {
					break;
				}else if(j==found.length-1) {
					found[x] = arr[i];x++;
				}
			}
		}
		System.out.println(Arrays.toString(remove_zeros(found)));
	}
}
