package easyProblems;

import org.junit.Test;

public class Postive {
	
	@Test
	public void examplePostive()
	{
		int[] nums = {-1,-2,-3,5,9,10,-6};
		
		printPostive(nums);
		
		
	}



	private void printPostive(int[] nums) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>=0)
			{
				System.out.println(nums[i]);
			}
			
		}
		
	}

}
