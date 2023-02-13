package practice;

import java.util.Arrays;

public class ArrayPartion {

	
	public void exampleData()
	{
		int nums[] = {1,4,3,2};
		
		arrayPartion(nums);
		
	}

	private int arrayPartion(int[] nums) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
        int sum =0;
        for(int i=0;i<nums.length;i+=2)
        {
            sum = sum +Math.min(nums[i],nums[i+1]);
        }

        return sum;
	}
}
