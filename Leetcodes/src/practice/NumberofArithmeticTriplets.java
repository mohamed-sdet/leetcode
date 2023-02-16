package practice;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class NumberofArithmeticTriplets {

	@Test
	public void exampleData()
	{
		int [] nums = {0,1,4,6,7,10};
		int diff = 3;
		
		arithmeticTriplets(nums,diff);
		
	}

	private void arithmeticTriplets(int[] nums, int diff) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> set = new HashSet<>();
		int counter=0;
		for(int i=0;i<nums.length;i++)
		{
			set.add(nums[i]);
			
			int temp1 = nums[i]-diff;
			int temp2 = temp1 -diff;
			
			if(set.contains(temp1) && set.contains(temp2))
			{
				counter++;
			}
		}
		System.out.print(counter);
		
	}
	
}
