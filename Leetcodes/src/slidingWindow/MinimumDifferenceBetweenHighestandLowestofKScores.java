package slidingWindow;

import java.util.Arrays;

import org.junit.Test;

public class MinimumDifferenceBetweenHighestandLowestofKScores {
	
	
	@Test
	public void examplePositive()
	{
		
		int [] nums = {9,4,1,7};
		int k = 2;
		minimumDifference1(nums,k);
	}
	
	
	public void minimumDifference(int[] nums, int k)
	{
		
		int start = 0;
		int min = Integer.MAX_VALUE;
		int sum=0;
		
		for(int i=0;i<k;i++) 
		{
			sum = sum+nums[i];
			System.out.print(sum);

		}
		
		
	}
public static int minimumDifference1(int[] nums, int k) {
		
		int start = 0, min = Integer.MAX_VALUE, diff = 0;
		Arrays.sort(nums);
				
		min = Math.min(min, nums[k - 1] - nums[start]);
		
		start++;
		while(k < nums.length) {
			diff = nums[k++] - nums[start++];
			min = Math.min(min, diff);
		}
		
		System.out.println(min);
		return min;   
    }

}
