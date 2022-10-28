package slidingWindow;

import org.junit.Test;

public class SubarrayProductLessThanK {
	
	
	
	
	/*
	 * 
	 */

	@Test
	public void examplePositive()
	{
		
		int [] nums = {10,5,2,6};
		int k=100;
		
		SubarrayProductLessThanK(nums,k);
	}

	private void SubarrayProductLessThanK(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		int left=0;
		int right;
		int max = Integer.MIN_VALUE;
		int product=1;

		
		for(right=0;right<nums.length;right++)
		{
			product = product * nums[right];
			if(max<product)
			{
				product =product/nums[left];
				left++;
			}
			max = Math.max(max, product);

		}
		System.out.print(max);

		
		
	}
	
}
