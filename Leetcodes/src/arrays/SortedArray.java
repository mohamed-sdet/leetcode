package arrays;

import java.util.Arrays;

import org.junit.Test;

public class SortedArray {
	
	@Test
	public void examplePostiveData()
	{
		
		int[] nums = {5,7,2,9,1,14,12,10,5,3};
		

		sortedArray(nums);
	}

	private void sortedArray(int[] nums) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<nums.length;i++)
		{
			for(int k=0;k<nums.length;k++)
			{
				
				if(nums[i]<nums[k])
				{
					
					int temp = nums[k];
					nums[k]= nums[i];
					nums[i]= temp;
					
				}
				
			}
		}
		
		System.out.print(Arrays.toString(nums));
		
	}
	
	public void sortedArrayTwopointer(int[] nums)
	{
		int start=0;
		int end=1;
		while(end<=nums.length)
		{
			
			if(nums[start]>nums[end])
			{
				int temp = nums[end];
				nums[end++]= nums[start];
				nums[start++]= temp;
				
			}
			
			end++;
		}
		
		System.out.print(Arrays.toString(nums));
		
	}

}
