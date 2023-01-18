package recollect;

import org.junit.Test;

public class HighestSumOfKElement {
	
	@Test
	public void exampleData()
	{
		int [] nums = {1,2,3,4,5,8,1};
		int k = 3;
		
		slidingindow(nums,k);
	}

	private void slidingindow(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i=0;i<k;i++)
		{
			sum+= nums[i];
			
		}
		max= sum;
		
		for(int j=k;j<nums.length;j++)
		{
			sum+= nums[j] - nums[j-k];
			max= Math.max(max, sum);
		}
		
		System.out.print(max);
		
	}
	
	
	

}
