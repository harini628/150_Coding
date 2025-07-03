package sam_pac;
import java.util.Arrays;
/*
Finding frequency of Unique elements in an array
Input : arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
Output : 5 1
 */
public class Hello {
	public static int count(int[] arr,int n) {
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n)c++;
		}
		return c;
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
		int found[] = new int[arr.length];int x=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<found.length;j++) {
				if(arr[i]==found[j]) {
					break;
				}else if(j==found.length-1) {
					found[x] = arr[i];x++;
					int c = count(arr,arr[i]);
					if(c == 1) {
						System.out.println(arr[i] + "->" + c);
					}
				}
			}
			
		}
	}
}
