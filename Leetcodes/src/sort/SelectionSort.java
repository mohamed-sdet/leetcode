package sort;

import java.util.Arrays;

import org.junit.Test;

public class SelectionSort {

	@Test
	public void exampleData()
	{
		int nums[] = {1,10,8,8,1};
		
		selectionsort(nums);
		
	}

	private void selectionsort(int[] nums) {
		// TODO Auto-generated method stub

       int pivot =0;
       
		for(int i=0;i<nums.length;i++)
		{
		pivot =i ;
		
		for(int j=i+1;j<nums.length;j++)
		{
		if(nums[pivot]>nums[j])
		{
		  pivot = j;
		}
		}
		int temp = nums[pivot];
		  nums[pivot] = nums[i];
		  nums[i]=temp;
	}
		
		System.out.println(Arrays.toString(nums));
	}
	
	
}
