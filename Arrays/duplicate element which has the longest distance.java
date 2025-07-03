package sam_pac;
import java.util.Arrays;
/*
Given an integer array find the duplicate element which has the longest distance

note: Assumed -1 as output if no duplicates are found
int arr[]={1,2,3,1,3,4,2,5,6,1};
O/p: 1
 */
public class Hello {
	public static int distance(int[] arr,int n,int index) {
		int dis=0;
		for(int i=arr.length-1;i>index;i--) {
			if(arr[i] == n) {
				dis = i-index;
				break;
			}else if( i== index+1 ) {
				dis = -1;
			}
		}
		return dis;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,3,4,2,5,6,1};int max=0;int index=-1;
		for(int i=0;i<arr.length;i++) {
			int dist = distance(arr,arr[i],i);
			if(max<dist) {
				max = dist;
				index = i;
			}
		}
		if(index == -1) {
			System.out.println(index);
		}else {
			System.out.println(arr[index]);
		}
		
		
	}
}
