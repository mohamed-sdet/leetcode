package dutchFlagAlgorithm;

import org.junit.Test;

public class Kadene {
	
	@Test
	public void examplePostiveData()
	{
		
		int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
		
		kandane(nums);
	}
	
	@Test
	public void exampleNegativeData()
	{
		
		int [] nums = {-2,-1,-3,-4,-1,-2,-1,-5,-4};
		
		kandane(nums);
	}
	@Test
	public void exampleNegativeData1()
	{
		
		int [] nums = {-2,-1,-3,-4,-1,-2,-1,-5,-4,0};
		
		kandane(nums);
	}

	private void kandane(int[] nums) {
		// TODO Auto-generated method stub
		int sum =0;
		int maxSum=Integer.MIN_VALUE;
		
		for(int i=0;i<nums.length;i++)
		{
			 sum = sum +nums[i];
			
			if(sum<0)
			{
				maxSum= Math.max(maxSum, sum);
				sum=0;
			}else
			{
				maxSum = Math.max(maxSum,sum);
			}
			
		}
		
		System.out.print(maxSum);
	}

}
