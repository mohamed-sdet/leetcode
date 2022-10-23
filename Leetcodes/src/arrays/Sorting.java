package arrays;

import java.util.Arrays;

import org.junit.Test;

public class Sorting {
	
	
	/* Traverse through the the input array 
	 * while traversing compare given array index from index +1
	 * if index value greater than index+1 swap 
	 */
	/* 1. Traverse through using two for loop with outer  and inner loop
	 * 2. compare i value  with i+1 value  
	 * 3. if i value greater than i+1 store it temp variable , then swap the value
	   4. return nums array 
	 */
	
	@Test
	public void examplePositive()
	{
		
		int nums[] = {1,8,5,8,6};
		
		sortArrays(nums);
		
		
	}
	public void exampleEdge()
	{
		
		int nums[] = {1,2,3,4,1,5,1};
		
		sortArrays(nums);
		
		
	}
	public void exampleNagative()
	{
		
		int nums[] = {1,2,-3,4,5};
		
		sortArrays(nums);
		
		
	}

	private void sortArrays(int[] nums) {
		// TODO Auto-generated method stub
		
		int temp=0;
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]>nums[i+1])
			{
				temp =nums[i];

				
			}
			
			
		}
		
		//System.out.print(Arrays.toString(sortedArray));
		
	}
	

}
