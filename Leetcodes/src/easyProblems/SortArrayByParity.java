package easyProblems;

import java.util.Arrays;

import org.junit.Test;

public class SortArrayByParity {
	
	
	//https://leetcode.com/problems/sort-array-by-parity/
	
	
	
	/*Initialize the two Pointer 
	 * 1)pointer start with zero 
	 * 2)Pointer end with zero
	 * Initialize while loop with end < length
	 * check condition right value % 2 not equal to 1
	 * if Mod %2 is one then move swap end  and start value then increment right 
	 * by default increment end value 
	 * 
	 */
	
	@Test
	public void examplepositiveData()
	{
		
		int [] nums = {3,1,2,4};
		
		sortArrayByParity(nums);
		
	}
	
	@Test
	public void exampleedgeData()
	{
		
		int [] nums = {4,4,4,4,3};
		
		sortArrayByParity(nums);
		
	}
	
	@Test
	public void examplenegativeData()
	{
		
		int [] nums = {3,3};
		
		sortArrayByParity(nums);
		
	}

	private void sortArrayByParity(int[] nums) {
		// TODO Auto-generated method stub
		
		int end=0,start=0;
		
		while(end<nums.length)
		{
			if(nums[end] % 2 != 1)
			{
				int temp;
				
				temp=nums[end];
				nums[end]=nums[start];
				nums[start++] = temp;
				
			}
			end++;
			
		}
		
		System.out.println(Arrays.toString(nums));
		
	}
	

}
