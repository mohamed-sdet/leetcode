package problems;

import org.junit.Test;

public class HighestSumOfkConsecutive {
	
	
	@Test
	public void postiveData()
	{
		int [] nums = {1,2,5,8,9,3,6,5};
		int target = 3;
		
		consecutiveSum(nums,target);
	}

	private void consecutiveSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		
		int max = Integer.MIN_VALUE;
		int sum =0;
		
		for(int i=0;i<target;i++)
		{
			sum += nums[i];
		}
		
		max= sum;
		
		for(int j=target;j<nums.length;j++)
		{
			sum += nums[j] - nums[j-target];
			max = Math.max(max, sum);
		
		}
		
		System.out.print(max);
		
	}

}
