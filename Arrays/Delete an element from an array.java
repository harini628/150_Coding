package sam_pac;
import java.util.Arrays;
/*
Delete an element from an array
Input: arr[] = [10, 20, 30, 40], pos = 2
Output: [10, 30, 40]
 */
public class Hello {
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40};
		int pos = 2;
		int res[] = new int[arr.length-1];int x=0;
		for(int i=0;i<arr.length;i++) {
			if(i == pos-1) {
				continue;
			}
			res[x] = arr[i];
			x++;
		}
		System.out.print(Arrays.toString(res));
		
	}
}
