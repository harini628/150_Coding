package sam_pac;
import java.util.Arrays;
/*
Group Reverse

int a[] = { 10, 20, 30, 40, 50, 25, 35, 45 }; d=2
Expected OP: 30 20 10 45 35 25 50 40

 */
public class Hello {
	
	
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 25, 35, 45 };
		int d=2;
		int[] res = new int[arr.length];
		int x=0;
		for(int i=d;i>=0;i--) {
			res[x] = arr[i];
			x++;
		}
		for(int j=arr.length-1;j>d;j--) {
			res[x] = arr[j];
			x++;
		}
		System.out.print(Arrays.toString(res));
		
	}

}
