package sam_pac;
import java.util.Arrays;
/*
Check if 2 Arrays are equal or not.
Input: a[] = [1, 2, 5, 4, 0], b[] = [2, 4, 5, 0, 1]
Output: true
 */
public class Hello {
	public static boolean found(int[] arr,int n) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == n)return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 5, 4, 0};
		int[] arr2 = {2, 4, 5, 0, 1};
		Boolean res = true;
		if(arr1.length != arr2.length)res = false;
		else {
			for(int i=0;i<arr1.length;i++) {
				boolean result = found(arr2,arr1[i]);
				if(result == false) {
					res = false;
					break;
				}
			}
		}
		System.out.print(res);
	}
}
