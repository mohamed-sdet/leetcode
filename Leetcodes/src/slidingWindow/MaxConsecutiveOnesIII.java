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

	private void longestOnes(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		
		int start=0;

		
		
		
		for(int right=0;right<nums.length;right++)
		{
			if(right==0)
			{
				k--;
				
			}
			if(k<0)
			{
				start++;
				
			}

		}
	
	}
	
	
	
	
}
