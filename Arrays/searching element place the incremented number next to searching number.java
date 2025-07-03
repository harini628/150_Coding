package sam_pac;
import java.util.Arrays;
/*
Given an integer array using searching element place the incremented number
next to searching number
Input = {10,20,10,30,14,40,60,10}
Search=10
Output={10,1,20,10,2,30,14,40,60,10,3}
 */
public class Hello {
	public static int count(int[] arr,int n) {
		int c = 0;
		for(int i=0;i<arr.length;i++) {
			if(n == arr[i])c++;
		}
		return c;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,20,10,30,14,40,60,10};
		int search = 10;
		int res[] = new int[count(arr,search)+arr.length];int c = 0;int x=0;
		for(int i=0;i<arr.length;i++) {
			res[x] = arr[i];
			x++;
			if(arr[i]==search) {
				c++;
				res[x] = c;
				x++;
			}
		}
		System.out.print(Arrays.toString(res));
		
	}
}
