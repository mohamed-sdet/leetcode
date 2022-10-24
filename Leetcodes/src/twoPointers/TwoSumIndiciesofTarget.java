package twoPointers;

import org.junit.Test;

public class TwoSumIndiciesofTarget {
	
	
	
	@Test
	public void examplePositive()
	{
		int[] input = {1,2,2,3,4,6,7};
		int k=5;
		twoSumindicies(input,k);
		
	}
	
	public void twoSumindicies(int[] nums,int k)
	{
		
		int right = nums.length-1;
		int left = 0;
		
		while(left<right)
		{
			int sum = nums[left]+nums[right];
			 
			if(sum==k)
			{
				System.out.println(left  + ", " + right);
			    break;
			
			}else if(sum<k)
			{
				left++;
			}
			else 
			{
				right--;
			}
			
			
			
		}
		
	}
	
	
	

}
