package recollect;

import java.util.Arrays;

import org.junit.Test;

public class FindSquare {

	@Test
	public void exampleData()
	{
		
		int [] nums = {2,3,4,5,6};
		
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
