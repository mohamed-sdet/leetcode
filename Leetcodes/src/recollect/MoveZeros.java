package recollect;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeros {

	@Test
	public void exampleData()
	{
		
		int nums [] = {1,2,0,4,2,0,3,5};
		
		moveZeroswithzero(nums);
	}

	private void moveZeros(int[] nums) {
		// TODO Auto-generated method stub
		int left =0;
		int right =0;
		int counter=0;
		
		while(right<nums.length)
		{
			if(nums[right]!=0)
			{
				nums[counter++] = nums[right];
			}

				right++;

		}
		
		System.out.print(Arrays.toString(nums));
	}
	
	private void moveZeroswithzero(int[] nums)
	{
		int left=0;
		int right=0;
		
		while(right<nums.length)
		{
			if(nums[right]!=0)
			{
				int temp = nums[right];
				nums[right] = nums[left];
				nums[left++] = temp;
			}   
			right++;

		}
		System.out.print(Arrays.toString(nums));
	}
}
