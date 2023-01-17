package recollect;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class FindSquare {

	@Test
	public void exampleData()
	{
		
		int [] nums = {2,3,4,5,6};
		
		System.out.print(Arrays.toString(findtheSquare(nums)));
	}
	
	@Test
	public void exampleData1()
	{
		
		int [] nums = {2,3,4,5,6};
		Assert.assertEquals(true, Arrays.equals(findtheSquare(nums), new int [] {4, 9, 16, 25, 36}));
		System.out.print(Arrays.toString(findtheSquare(nums)));
	}

	private int[] findtheSquare(int[] nums) { 
		// TODO Auto-generated method stub
		
		for(int i =0;i<nums.length;i++)
		{
		    nums[i] = nums[i]*nums[i];	
		}
		
		return nums;
	}
	
}
