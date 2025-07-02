package sam_pac;
import java.util.Arrays;
/*
Frequency count with descending order printing

input : { 50, 20, 150, 20, 50, 10, 30, 10, 10 }
output:
10 -> 3
50 -> 2
20 -> 2
150 -> 1
30 -> 1

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
				else if(count[m]<count[n]) {
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
