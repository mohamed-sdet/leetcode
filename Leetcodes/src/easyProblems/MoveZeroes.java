package easyProblems;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeroes {
	
	@Test
	public void examplePositiveData()
	{
		int [] nums = {0,1,0,3,12};
		
		moveZeroesTwoPinters(nums);
	}

	private void moveZeroes(int[] nums) {
		// TODO Auto-generated method stub
		
		int count =0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=0)
			{
              nums[count++]= nums[i];
				
			}
		}
		System.out.print(Arrays.toString(nums));
		while(count<nums.length)
		{
			nums[count++]=0;
		}
		System.out.print(Arrays.toString(nums));
	}
	
	
	
	private void moveZeroesTwoPinters(int[] nums)
	{
		int left =0,right=0;
		
		while(right<nums.length)
		{
			if( nums[right]!=0)
			{
				int temp;
				temp=nums[right];
				nums[right]=nums[left];
				nums[left++]=temp;
			}right++;
		}
		System.out.print(Arrays.toString(nums));
		
	}

	
	
	

}
