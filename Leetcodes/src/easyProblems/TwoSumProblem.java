package easyProblems;

import org.junit.Test;

public class TwoSumProblem {
	
	//https://leetcode.com/problems/two-sum/
	
	 //BruteForce
	/*Traverse the input Array , until length of the nums -1
	 * Initialize temp variable and store num i + num i+ 1 
	 * Now check for the condition if then tem value matching target 
	 * If it matched store the value in int out put array of zero and one
	 * Return the output 
	 */

	@Test
	public void examplePositiveTestData()
	{
		int[] nums = {7,2,3,7,3};
		int target = 9;
		
		twosumProblem(nums,target);
		
	}
	@Test
	public void exampleEdgeTestData()
	{
		int[] nums = {5,2,1,1,3};
		int target = 3;
		twosumProblem(nums,target);
		
	}
	@Test
	public void exampleNegativeTestData()
	{
		int[] nums = {2,1,1,9};
		int target = 12;
		twosumProblem(nums,target);
		
	}
	
	private void twosumProblem(int[] nums, int target) {
		// TODO Auto-generated method stub
		boolean bMatch=false;
		for(int i=0;i<nums.length;i++)
		{

			
			for(int j=i+1;j<nums.length;j++)
			{
				int temp = nums[i]+nums[j];
				if(temp== target)
				{
					System.out.println(i + " "+ j);
					bMatch =true;
				}

			
			}

		}
		if(bMatch==false)
		{
			throw new RuntimeException("No Match ");
			
		}
		
	}
	
	private void twoSumOtimized(int[] nums, int target) {
		
		
		int start = 0 , end= nums.length;
		
		while(start<end)
		{
			int sum = nums[start]+nums[end];
			if( sum == target)
			{
				System.out.println(start + " "+ end);
				start++;
				end--;
				
				
			}else if(sum>target)
			{
				
				end--;
			}else 
			{
				
				start++;
			}
		}
		
		
	}
	
	
	
	
	
}
