package sam_pac;
import java.util.*;
/*
Given an array of integers nums and an integer target, return indices of the two
numbers such that they add up to target.
Input: arr[] = [0, -1, 2, -3, 1], target = -2
Output: 3 4
Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2
 */

public class Hello {
	public static void main(String[] args) {
		
		int[] arr = {0, -1, 2, -3, 1};
		int target = -2;boolean flag = true;
		for(int i=0;i<arr.length;i++) {
			if(flag) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]+arr[j] == target && i!=j) {
					System.out.println(i+" "+j);
					flag=false;
					break;
				}
				
			}
			}else {
				break;
			}
		}
		
	}
}
