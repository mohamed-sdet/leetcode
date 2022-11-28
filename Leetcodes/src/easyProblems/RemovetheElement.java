package easyProblems;

import java.util.Arrays;

import org.junit.Test;

public class RemovetheElement {
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	@Test
	public void PositiveData() 
	{
		
		int [] nums = {3,2,2,3};
		int target = 3;
		
		removeElemet(nums,target);
		
	}

	private void removeElemet(int[] nums, int target) {
		// TODO Auto-generated method stub
		
		int [] temp = new int[nums.length];
		
		int count=0;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=target)
			{
				temp[count++] = nums[i];
			}
			
		}
		System.out.print(Arrays.toString(temp));
	}

}
