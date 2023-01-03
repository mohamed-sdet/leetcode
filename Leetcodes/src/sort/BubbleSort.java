package sort;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSort {
	@Test
	public void examplePostiveData()
	{
		int[] nums = {2,1,4,3,6,5,8,7};
		
		//bubbleSort(nums);
		bubbleSort3(nums);
		
		
	}

	private void bubbleSort(int[] nums) {
		// TODO Auto-generated method stub
		int temp;
		for (int i = 0; i < nums.length; i++) 
		{
			for (int j = 1; j < nums.length-i; j++)
			{
				if(nums[j-1] > nums[j])
				{
					temp = nums[j];
					nums[j] = nums[j-1];
					nums[j-1] = temp;
				}
		    }
	     }
		System.out.print(Arrays.toString(nums));
	}

	private void bubbleSort2(int[] nums) {
		// TODO Auto-generated method stub
		int temp;
		for (int i = 0; i < nums.length; i++) 
		{
			for (int j = 1; j < nums.length-i; j++)
			{
				if(nums[j-1] > nums[j])
				{
					temp = nums[j];
					nums[j] = nums[j-1];
					nums[j-1] = temp;
				}
		    }
	     }
		System.out.print(Arrays.toString(nums));
	}
	
	private void bubbleSort3(int[] nums)
	{
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=1;j<nums.length-i;j++)
			{
				if(nums[j-1]>nums[j])
				{
					int temp = nums[j];
					nums[j] = nums[j-1];
					nums[j-1]= nums[temp];
				}
			}
		}
		System.out.print(Arrays.toString(nums));
	}
	
}
