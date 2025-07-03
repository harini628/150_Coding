package sam_pac;
import java.util.Arrays;
/*
Insert an element in an array
Input: arr[] = [10, 20, 30, 40], pos = 3, ele = 50
Output: [10, 20, 50,30, 40]
 */
public class Hello {
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40};
		int pos = 3;int ele = 50;
		int res[] = new int[arr.length+1];int x=0;
		for(int i=0;i<arr.length;i++) {
			if(i == pos-1) {
				res[x] = ele;
				x++;
			}
			res[x] = arr[i];
			x++;
		}
		System.out.print(Arrays.toString(res));
		
	}
}
