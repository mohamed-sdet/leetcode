package twoPointers;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortedArray {

	
	/*Merge Sorted Array
	 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
		Merge nums1 and nums2 into a single array sorted in non-decreasing order.
	 */
	
	
	@Test
	public void examplePositive()
	{
		int [] nums1 = {1,2,3,0,0,0}; 
		int m = 3;
		int[] nums2 = {2,5,6};
		int n = 3;
		
		mergeSortedArray(nums1,m,nums2,n);
		
	}

	private void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
		// TODO Auto-generated method stub
		
		 int left=m-1, right=n-1;
	        int i=nums1.length-1;
	        for(;i>0;i--){
	            if(left>=0 && right>=0) {
	                if (nums1[left] > nums2[right]) {
	                    nums1[i] = nums1[left--];
	                }
	                else nums1[i]=nums2[right--];
	            }
			
		System.out.print(Arrays.toString(nums1));
		
		
	}
	}
}
	
	
	
	

