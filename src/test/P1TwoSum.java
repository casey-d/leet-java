package test;

import java.util.Arrays;
import java.util.HashMap;

/*
 * https://leetcode.com/problems/two-sum/description/
 * 
 */
public class P1TwoSum {

	//Time brute-force approach
	public static int[] getIndices(int[] arr, int target) {
		int[] result = {};
		
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]+arr[j]==target) {
					return new int[]{i,j};
				}
			}
		}
		
		return result;
		
		
	}
	
	//Time efficient approach
	public static int[] getIndicesEfficient(int[] arr, int target) {
		int[] result = {};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i=0;i<arr.length;i++) {
			
			Integer needed = map.get(target-arr[i]);
			if (needed!=null) {
				return new int[] {needed,i};
			} else {
				map.put(arr[i], i);
			}
		}
		
		
		return result;
	}
	
	
	public static void main(String[] args) {
		int[] input1 = {2,7,11,15};
		int target1 = 9;
		System.out.println(Arrays.toString(P1TwoSum.getIndices(input1, target1)));
		System.out.println(Arrays.toString(P1TwoSum.getIndicesEfficient(input1, target1)));
		
		
		int[] input2 = {3,2,4};
		int target2 = 6;
		System.out.println(Arrays.toString(P1TwoSum.getIndices(input2, target2)));
		System.out.println(Arrays.toString(P1TwoSum.getIndicesEfficient(input2, target2)));
		
		
		int[] input3 = {3,3};
		int target3 = 6;
		System.out.println(Arrays.toString(P1TwoSum.getIndices(input3, target3)));
		System.out.println(Arrays.toString(P1TwoSum.getIndicesEfficient(input3, target3)));
		
		
	}
}
