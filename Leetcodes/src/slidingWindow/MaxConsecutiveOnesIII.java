package slidingWindow;

import org.junit.Test;

public class MaxConsecutiveOnesIII {

	/*
	 * Subarray Product Less Than K
	 */
	
	
	
	@Test
	public void examplePositiveData()
	{
		
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0} ;
		int k = 2;
		
		longestOnes(nums,k);
		
	}

	private void longestOnes(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		
		int start=0;
		int end=0;
		
		while(end<=nums.length)
		{
			if(nums[end]!=1)
			{
				System.out.println(nums[start]+ nums[end]);
				start++;
				
			}end++;
			
			break;
		}
		
		
	}
	
	
	
	
}
