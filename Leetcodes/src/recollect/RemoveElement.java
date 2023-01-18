package recollect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class RemoveElement {

	@Test
	public void postiveTestData() 
	{
		
		int [] nums = {1,2,3,5,6,8,9,2};
		int target = 2;
		
		//removetarget(nums,target);
		
		removeElementUsingTwoPointer(nums,target);
		
		
	}
	@Test
	public void postiveTestData2() 
	{
		
		int [] nums = {1,2,3,5,6,8,9,2};
		int target = 2;
		
		Assert.assertTrue(Arrays.equals(removetarget(nums,target), new int[] {1, 3, 5, 6, 8, 9}));
		
		
	}

	private int[] removetarget(int[] nums, int target) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=target)
			{
				list.add(nums[i]);
			}
		}
		
		int [] output = new int[list.size()];
		
		int counter =0;
		for(int i: list)
		{
			output[counter++] = i;
		}
		
		System.out.print(Arrays.toString(output));
		
		return output;
	}
	
	public void removeElementUsingTwoPointer(int[] nums, int target)
	{
		int left =0;
		int right =0;
		
		while(right<nums.length)
		{
			if(nums[right] !=target)
			{
				int temp = nums[right];
				nums[right] = nums[left];
				nums[left++]= temp;
			}
			right++;
		}
		
		System.out.print(Arrays.toString(Arrays.copyOf(nums,left)));
	}
}
