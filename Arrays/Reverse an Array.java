package sam_pac;
import java.util.Arrays;
/*
Reverse an Array
Input: arr = [4, 5, 2]
Output: [2, 5, 4]
Explanation: The elements of the array are 4 5 2. The reversed array will be 2 5 4.
 */
public class Hello {
	
	public static void main(String[] args) {
		int[] arr = {4, 5, 2};int sum=0;
		int rev[] = new int[arr.length];
		int x=0;
		for(int i=arr.length-1;i>=0;i--) {
			rev[x] = arr[i];x++;
		}
		System.out.print(Arrays.toString(rev));
	}
}
