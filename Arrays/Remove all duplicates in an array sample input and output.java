package sam_pac;
import java.util.Arrays;
/*
Remove all duplicates in an array sample input and output

Input:[1, 2, 2, 3, 4, 4, 5]
Output:[1, 2, 3, 4, 5]
 */
public class Hello {
	public static int[] remove_duplicate(int[] arr) {
		int res[] = new int[arr.length];int x=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<res.length;j++) {
				if(arr[i]==res[j]) {
					break;
				}else if(j==res.length-1){
					res[x] = arr[i];
					x++;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,2,5,3,4,4,5};
		int[] sol = remove_duplicate(arr);int count=0;
		for(int i=sol.length-1;i>=0;i--) {
			if(sol[i] == 0) {
				count++;
			}else {
				break;
			}
		}
		int res[] = new int[sol.length-count];
		for(int k=0;k<res.length;k++) {
			res[k] = sol[k];
		}
		System.out.println(Arrays.toString(res));
		

	}

}
