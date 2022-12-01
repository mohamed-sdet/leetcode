package hardProblems;

import org.junit.Test;

public class MinimumSizeSubarraySum {
	
	//https://leetcode.com/problems/minimum-size-subarray-sum/
	
	/*Traverse the input array to end using for loop with right 
	 * sum the value one another one 
	 * then use while condition for left point 
	 * if sum = target then grow right and shirk left 
	 * if sum > target then shrink  left 
	 * if sum <target  then grow right
	 * finally return the value 
	 */

	@Test
	public void  examplePositiveData()
	{
		
		int []  nums = {2,3,1,2,4,3};
		int target = 7;
		
		minimumSizeSubarraySum(nums, target);
		
	}
	@Test
	public void  exampleEdgeData()
	{
		
		int []  nums = {1,1,1,1,1,1,1,1};
		int target = 11;
		
		minimumSizeSubarraySum(nums, target);
		
	}
	@Test
	public void exampleEdgeData2()
	{
       int[] nums = {1,2,3,4,5};
       int target = 11;
       minimumSizeSubarraySum(nums, target);
	}
	
	private void minimumSizeSubarraySum(int[] nums, int target) {
		// TODO Auto-generated method stub
		
		int left=0,right=0,sum=0,minSum=Integer.MAX_VALUE;
		for(;right<nums.length;right++)
		{
			sum += nums[right];
			while(sum>target)
				sum -= nums[left++];
			if(sum==target)
			{
				int temp = right-left+1;
				minSum=Math.min(temp, minSum);	
			}
		}
		System.out.print(minSum);	
	}

}
