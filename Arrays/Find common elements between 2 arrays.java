package sam_pac;
import java.util.*;
/*
Find common elements between 2 arrays.
Input : a[] = {1, 2, 3, 1, 1}, b[] = {3, 1, 3, 4, 1}
Output : {1, 3, 1}
 */

public class Hello {
	public static int count(int n,int[] arr) {
		int c = 0;
		for(int i=0;i<arr.length;i++) {
			if(n == arr[i])c++;
		}
		return c;
	}
	public static int rangecount(int n,int j,int[] arr) {
		int c = 0;
		for(int i=0;i<=j;i++) {
			if(n == arr[i])c++;
		}
		return c;
	}
	
	
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 1, 1};
		int[] b = {3, 1, 3, 4, 1};
		ArrayList <Integer> arr_int = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			if(rangecount(a[i],i,a) <= count(a[i],b)) {
				arr_int.add(a[i]);
			}
		}
		
		System.out.println(arr_int);
	}
}
