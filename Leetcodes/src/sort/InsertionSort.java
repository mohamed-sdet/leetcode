package sort;

import java.util.Arrays;

import org.junit.Test;

public class InsertionSort {

	@Test
	public void exampleData()
	{
		
		int [] nums = {2,1,4,3,6,5,8,7,9,8};
		
		insertionSort(nums);
		
	}

	private void insertionSort(int[] nums) {
		// TODO Auto-generated method stub
		
	
	        for (int i = 0; i < nums.length; i++) 
	        {
	            int pivot = nums[i];
	            int j = i - 1;
	            while (j >= 0 && nums[j] > pivot)
	            {
	            	nums[j + 1] = nums[j];
	                j = j - 1;
	            }
	            nums[j + 1] = pivot;
	        }
	      
	        System.out.print(Arrays.toString(nums));
	        
		
	}
	
}
