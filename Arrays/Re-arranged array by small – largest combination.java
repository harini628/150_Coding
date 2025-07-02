package sam_pac;
import java.util.Arrays;

public class Hello {
	public static int[] large(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {1,3,5,2,8,7,4};
		int[] sol = large(arr);
		int res[] = new int[arr.length];
		int i=0;int j=sol.length-1;int x=0;
		boolean flag = true;
		while(x<arr.length) {
			if(flag) {
				res[x] = sol[j]; 
				flag = false;
				j--;
			}else {
				res[x] = sol[i];
				flag = true;
				i++;
			}
			x++;
		}
		System.out.println(Arrays.toString(res));
	}

}
