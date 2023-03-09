package problems;

import org.junit.Test;

public class SlidingWindowDesiredSum {

	
	@Test
	public void examplePostiveData()
	{
		
		int [] nums = {1,7,4,3,1,2,1,5,1};
		int val =7;
		
		consecutiveSums(nums,val);
		
		
	}

	private void consecutiveSums(int[] nums, int val) {
		// TODO Auto-generated method stub
		int left=0;
		int sum =0;
		for(int right=0;right<nums.length;right++)
		{
			sum += nums[right];
			
			
			while(sum>val)
			{
				sum = sum - nums[left++];
			}
			
			if(sum==val)
			{
				System.out.println(nums[left] +"    "+ nums[right]);
			}
			
		}
		
	}
	
}
