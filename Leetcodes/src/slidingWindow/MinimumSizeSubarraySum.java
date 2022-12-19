package slidingWindow;

import org.junit.Test;

public class MinimumSizeSubarraySum {
	
 @Test
  public void examplePostive()
  {
	  
	  int [] nums = {2,3,1,2,4,3};
	  int target =7;
	  
	  minimumSizeSubarraySum(nums,target);
  }

private void minimumSizeSubarraySum(int[] nums,int target) {
	// TODO Auto-generated method stub
	
	int min =Integer.MAX_VALUE;
	int sum=0;
	
	for(int i=0;i<nums.length;i++)
	{
		sum += nums[i];
		int left =0;
		while(sum>=target)
		{
			min =Math.min(min,i-left+1);
			sum -=nums[left++];
			//left++;
		}
	}
	
	System.out.print(min);
	
}
	
}
