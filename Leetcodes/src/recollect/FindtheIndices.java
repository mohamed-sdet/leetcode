package recollect;

import org.junit.Test;

public class FindtheIndices {
	
	@Test
	public void TestCase1()
	{
		
		int nums[] = {5,3,2,1,8};
		
		int target = 9;
		
		findTwoSum(nums,target);
		findTwosum1pass(nums,target);
		findTwoSumTwoPinter(nums,target);
		
	}
	
	@Test
	public void TestCase1Sorted()
	{
		
		int nums[] = {1,3,5,8,9,10};
		
		int target = 10;
		
		returnSum(nums, target);
		
	}

	private void returnSum(int[] nums,int target) {
		// TODO Auto-generated method stub
		
		int left=0,right=nums.length-1;
		
		while(left<right)
		{
			int sum = nums[left]+ nums[right];
			if(sum ==target)
			{
				System.out.print(left+" "+right );
				break;
			}else if(sum>target)
			{
				right--;
			}else 
			{
				left++;
			}
				
			
		}
		
	}

	private void findTwoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]+nums[j]==target)
				{
					System.out.println(nums[i] +" "+ nums[j]);
					
				}
			}
		}
		
	}

	private void findTwosum1pass(int[] nums, int target)
	{
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]+nums[i+1]==target)
			{
				System.out.println(nums[i] +" "+nums[i+1]);
			}
		}
	}

	private void findTwoSumTwoPinter(int[] nums, int target)
	{
		int left = 0;
		int right=1;
		
		while (right<nums.length)
		{
			if(nums[left]+nums[right]==target)
			{
				System.out.print(left +" "+right);
				break;
			}else
			{
				left++;
				right++;
			}
		}
	}
}
