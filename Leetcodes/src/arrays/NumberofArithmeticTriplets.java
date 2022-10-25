package arrays;

import org.junit.Test;

public class NumberofArithmeticTriplets {
	
	/*
	 * 2367. Number of Arithmetic Triplets
	You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

	i < j < k,
	nums[j] - nums[i] == diff, and
	nums[k] - nums[j] == diff.
	Return the number of unique arithmetic triplets.
	 */
	
	@Test
	public void examplePositive()
	{
		
		int[]  nums = {0,1,4,6,7,10};
		int diff = 3;
		
		NumberofArithmeticTriplets(nums,diff);
	}
	
	@Test
	public void exampleEdge()
	{
		
		int[]  nums = {4,5,6,7,8,9};
		int diff = 2;
		
		NumberofArithmeticTriplets(nums,diff);
	}

	private void NumberofArithmeticTriplets(int[] nums, int diff) {
		// TODO Auto-generated method stub
		
		int count =0;
		for(int i=0;i<nums.length-2;i++)
		{
			for(int j=i;j<nums.length-1;j++)
			{
				for(int k=j+1;k<nums.length;k++)
				{
					int a = nums[j] - nums[i];
					int b = nums[k] - nums[j];
					if(a== diff && b== diff )
					{
					count ++;
					}

					
				}
			}
		}
		
		System.out.println(count);
		
		
	}
	
}
