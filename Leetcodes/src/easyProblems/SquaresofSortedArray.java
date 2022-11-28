package easyProblems;

import java.util.Arrays;

import org.junit.Test;

public class SquaresofSortedArray {
	
	

		//*https://leetcode.com/problems/squares-of-a-sorted-array/
	
	/* Traverse through the input array  
	 * Initialize the value and square it
	 * after squared the value sort and return the value
	 * 
	 * 
	 */
	 	
	@Test
	public void PositveData()
	{
		int [] nums = {-4,-1,0,3,10};
		
		squareAndSort(nums);
		
	}
	@Test
	public void EdgeData()
	{
		int [] nums = {-4,-1,0,-3,-10};
		
		squareAndSort(nums);
		
	}
	@Test
	public void NegavtiveData()
	{
		int [] nums = { };
		
		squareAndSort(nums);
		
	}

		private void squareAndSort(int[] nums) {
			// TODO Auto-generated method stub
			
			for(int i=0;i<nums.length;i++)
			{
				nums[i] = nums[i]*nums[i];
				
			}
			
			Arrays.sort(nums);
			
			System.out.print(Arrays.toString(nums));
			
			
		}
	

}
