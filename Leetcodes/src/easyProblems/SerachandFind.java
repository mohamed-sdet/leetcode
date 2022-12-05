package easyProblems;

import org.junit.Test;

public class SerachandFind {
	
	
	/*
	 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
	Input: nums = [-1,0,3,5,9,12], target = 9
	 * Solve in two pointer 
	 * 
	 * 
	 * 
	 */
	
	
	 @Test
      public void examplePositiveData()
      {
    	  int [] nums = {-1,0,3,5,9,12};
    	  
    	  int target = 9;
    	  
    	  serachandFind(nums,target);
    	  
      }

	private void serachandFind(int[] nums, int target) {
		// TODO Auto-generated method stub
		
		int left =0,right =0;
		
		while(right<nums.length)
		{
			if(nums[right]==target)
			{
				System.out.print(nums[right]);
				right++;
			}else if(nums[right]==target)
			{
				
				System.out.print(nums[left]);
				left++;
			}else 
			{
				right++;
			}
			
		}
		
		
	}
}
