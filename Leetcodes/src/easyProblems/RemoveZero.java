package easyProblems;

import java.util.Arrays;

import org.junit.Test;

public class RemoveZero {
	
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	@Test
	public void postiveData()
	{
		
		int [] nums = {0,1,0,3,12};
		removeZerosWithoutRelativeOrder(nums);
		
	}

	private void removeZerosWithoutRelativeOrder(int[] nums) {
		// TODO Auto-generated method stub
		
		
		int start =0,end=nums.length-1;
		
		while(start<=end)
		{
			int temp;
			if(nums[start]==0 )
			{
				temp = nums[end];
				nums[end--]= nums[start];
				nums[start++]=temp;
				
			}else
			{
				start++;
				
			}
			
		}
		System.out.print(Arrays.toString(nums));
		
		
	}
	
	private void removeZerosWithRelativeOrder(int[] nums) {
		// TODO Auto-generated method stub
		
		
		int start =0,end=0;
		
		while(end>nums.length-1)
		{
			int temp;
			if(nums[start]==0 )
			{
				temp = nums[end];
				nums[end--]= nums[start];
				nums[start++]=temp;
				
			}
			
				start++;
				
		
			
		}
		System.out.print(Arrays.toString(nums));
		
		
	}
	
	
			
			
			

}
