package slidingWindow;

import org.junit.Test;

public class LongestSubarrayof1AfterDeletingOneElement {
	
	
	
	
	/*Psuedocode
	 * Solving this using sliding window technique 
	 * Set left as 0 and right as 0 and set k value as 1 as we allowed to delete one zero time 
	 * Increment right using for loop 
	 * if right value is zero then reduce the k
	 * 
	 */
	
	
	@Test
	public void examplePositive()
	{
		
		int[] nums = {1,1,0,1};
		
		LogestSubarray(nums);
		
	}

	@Test
	public void exampleEdge()
	{
		
		int[] nums = {0,1,1,1,0,1,1,0,1};
		
		LogestSubarray(nums);
		
	}
	
	@Test
	public void exampleNeagtive()
	{
		
		int[] nums = {1,1,1};
		
		LogestSubarray(nums);
		
	}
	
	
	private void LogestSubarray(int[] nums)
	{
		
		int left=0;
		int right=0;
		int k=1;
		int max = Integer.MIN_VALUE;
		int output = 0;
		int prezero = 0;
		
		for(right=0;right<nums.length;right++)
		{
			
			if(nums[right]==0) k--;

			if(k<0)
			{
				if(nums[left]==0)
				{
					k++;
					
				}left++;
			}
			
			if(k>=0 && k<=1)
			max= Math.max(max, right-left);
			
		}
		
		System.out.println(max);
		
		
	}
	
	}

