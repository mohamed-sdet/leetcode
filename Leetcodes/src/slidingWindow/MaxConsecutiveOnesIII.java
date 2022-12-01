package slidingWindow;

import org.junit.Test;

public class MaxConsecutiveOnesIII {

	/*Psuedocode
	 *Traverse the input array  towards right 
	 * if right is equal to 0 reduce the k value
	 * if k<0 then increment start and reset k value 
	 * Get max value right -left
	 */ 
	
	//* one hour
	
	@Test
	public void examplePositiveData()
	{
		
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0} ;
		int k = 2;
		
		longestOnes(nums,k);
		
	}

	
	@Test
	public void examplePositiveData2()
	{
		
		int[] nums = {1,1,1,1,0,0,0,1,0} ;
		int k = 2;
		
		longestOnes(nums,k);
		
	}

	private void longestOnes(int[] nums, int k) {
		// TODO Auto-generated method stub
				
		int left=0;
		int right=0;
	
		int min =Integer.MIN_VALUE;
		int max=0;
		for(right=0;right<nums.length;right++)
		{
			if(nums[right]==0)
			{
				k--;
				
			}
			if(k<0)
			{
				if(nums[left]==0)
				{
					k++;
				}left++;	
			}
			
		}
		System.out.println(right-left);
	}
	
	
	
	
}
