package twoPointers;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeros {
	
	@Test
	public void examplePositive()
	{
		int [] nums = {0,1,0,3,12};
		
		moveZerosToTheRight(nums);
		
	}

	private void moveZerosToTheRight(int[] nums) {
		// TODO Auto-generated method stub
		
		int right=0;
		int left=0;
		
		while(right<nums.length)
		{
			if(nums[right]!=0)
			{
				int temp = nums[right];
				nums[right]=nums[left];
				nums[left++]=temp;
				
				
			}right++;
			
		}
		
		System.out.print(Arrays.toString(nums));
		
	}
	
	

}
