package sam_pac;
import java.util.Arrays;
/*
Program to find the frequency count of every number in an array in ascending
order
Input={40,20,10,50,20,10,30,40}
50->1
30->1
40->2
20->2
10->2

 */
public class Hello {
	
	public static int count_num(int[] arr,int n) {
		int c = 0;
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i]) {
				c++;
			}
		}
		return c;
	}
	
	public static void printing(int[] found,int[] count) {
		for(int i=0;i<found.length;i++) {
			if(found[i]!=0) {
				System.out.println(found[i] + "->" + count[i]);
			}
			
		}
	}

	public static void main(String[] args) {
		int[] arr = { 50, 20, 150, 20, 50, 10, 30, 10, 10 };
		int[] found = new int[arr.length];int x=0;
		int[] count = new int[arr.length];
		int c;
	
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<found.length;j++) {
				if(arr[i] == found[j]) {
					break;
				}else if(j==found.length-1) {
					found[x] = arr[i];
					c = count_num(arr, arr[i]);
					count[x]=c;
					x++;
				}
			}
		}
		int max_count = count[0];
		for(int m=0;m<count.length-1;m++) {
			for(int n=m+1;n<count.length;n++) {
				if(count[m]==0)break;
				else if(count[m]>count[n]) {
					int temp = count[m];
					count[m]=count[n];
					count[n]=temp;
					temp = found[m];
					found[m]=found[n];
					found[n]=temp;
				}
			}
		}
		printing(found,count);
		
	}

}
