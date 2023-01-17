package recollect;

import org.junit.Test;

public class FindMinValue {
	
	@Test
	public void exampleData()
	{
		int [] nums = {1,2,3,4,5};
		
		findmin1(nums);
		
	}

	private void findmin(int[] nums) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]<min)
			{
				min=nums[i];
			}
		}
		System.out.print(min);
	}
	
	private void findmin1(int[] nums) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]<min)
			{

				
				min = Math.min(min,nums[i]);
			}
		}
		System.out.print(min);
	}

}
