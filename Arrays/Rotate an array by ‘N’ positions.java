package sam_pac;
import java.util.Arrays;
/*
Rotate an array by ‘N’ positions
Input:[1, 2, 3, 4, 5]
N = 2
Output:[3, 4, 5, 1, 2]
 */
public class Hello {
	

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n=2;
		int res[] = new int[arr.length];int x=0;
		for(int i=n;i<arr.length;i++) {
			res[x] = arr[i];
			x++;
		}
		for(int j=0;j<n;j++) {
			res[x] = arr[j];
			x++;
		}
		System.out.println(Arrays.toString(res));
	}

}
