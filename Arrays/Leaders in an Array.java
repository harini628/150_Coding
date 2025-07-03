package sam_pac;
import java.util.Arrays;
/*
Leaders in an Array.
Input: arr[] = [16, 17, 4, 3, 5, 2]
Output: [17 5 2]
Explanation:
17 is greater than all the elements to its right i.e., [4, 3, 5, 2], therefore 17 is a
leader. 5 is greater than all the elements to its right i.e., [2], therefore 5 is a leader.
2 has no element to its right, therefore 2 is a leader.
 */
public class Hello {
	
	public static int[] leaders(int[] arr,int index) {
		int max = arr[arr.length-1];int inx = arr.length-1;
		int res[] = new int[2];
		for(int i=index+1;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
				inx = i;
				
			}
		}
		res[0] = max;res[1]=inx;
		return res;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {16, 17, 4, 3, 5, 2};
		int index = 0;int lead =0;
		System.out.print("[");
		while(index != arr.length-1) {
			int[] res = leaders(arr,index);
			lead = res[0];index = res[1];
			System.out.print(lead+ " ");
		}
		System.out.print("]");
		
	}
}
