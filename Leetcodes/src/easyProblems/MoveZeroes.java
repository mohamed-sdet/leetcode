package easyProblems;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeroes {
	
	@Test
	public void examplePositiveData()
	{
		int [] nums = {0,1,0,3,12};
		
		moveZeroes(nums);
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


}
