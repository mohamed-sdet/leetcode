package easyProblems;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class Duplicate {

	
	@Test
	public void examplePositiveData()
	{
		int [] nums = {2,3,5,6,8,9,2,6,7};
		
		//findduplicate(nums);
		//findDuplicateSet(nums);
		findMinMax(nums);
		
	}

	private void findduplicate(int[] nums) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		for(int i=1;i<nums.length;i++)
		{
			if(nums[i]==nums[i-1])
			{
				System.out.println(nums[i]);
			}
		}
	}
	
	private void findDuplicateSet(int [] nums)
	{
		HashSet<Integer> set = new HashSet<>();
		for(int i :nums)
		{
			if(!set.add(i))
			{
				System.out.println(i);
			}
		}

	}
	
	private void findMinMax(int[] nums)
	{
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<nums.length;i++)
		{
			if(min>nums[i])
			{
			min = nums[i];
			}
			if(max<nums[i])
			{
				max = nums[i];
			}
			
		}
		System.out.println("MIN loop value" + ":"+ min);
		System.out.println("max loop value" + ":"+ max);
			
			//Arrays.sort(nums);
			//System.out.print("minvalue "+ nums[0]);
				//System.out.print("maxvalue "+ (nums.length-1));
	}
}
