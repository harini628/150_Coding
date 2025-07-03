package sam_pac;
import java.util.Arrays;
/*
Middle Element in an array.
Input: arr = {1, 2, 3, 4, 5}
Output: 3
Input: arr = {7, 8, 9, 10, 11, 12}
Output: 9 10
 */
public class Hello {
	
	public static void main(String[] args) {
		int[] arr = {7, 8, 9, 10, 11,12};
		int middle;
		if(arr.length%2 !=0) {
			System.out.println(arr[arr.length/2]);
		}
		else {
			System.out.print(arr[(arr.length/2)-1] + " " + arr[(arr.length/2)]);
		}
	}
}
