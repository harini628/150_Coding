package sam_pac;
import java.util.Arrays;
/*
Program to find the frequency count of every number in an array

Input={40,20,10,50,20,10,30,40}
Output:
40 -> 2
20 -> 2
10 -> 2
50 -> 1
30 -> 1
 */
public class Hello {
	
	public static int count_num(int[] arr,int n) {
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i]) {
				c++;
			}
		}
		return c;
	}
	public static void display(int[] freq,int[] count) {
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=0)System.out.println(freq[i] + "->" + count[i]);
			
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {40,20,10,50,20,10,30,40};
		int[] found = new int[arr.length];int x=0;
		int[] count = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<found.length;j++) {
				if(found[j]==arr[i] ) {
					break;
				}else if(j==found.length-1) {
					found[x] = arr[i];
					int c=count_num(arr,arr[i]);
					count[x] = c;
					x++;
				}
			}
		}
		display(found,count);
		
		
	}

}
