package slidingWindow;

import org.junit.Test;

public class MaximumSubarray {

	
	/*loop and add first k element 
	 * store the value and find max 
	 * remove index one and add last index 
	 * store the index and find max 
	 *finally return max sum 
	 */
	@Test
	public void examplePositive()
	{
		int [] nums = {1,5,2,3,7,1};
		int k=3;
		
		maximumSubarray(nums,k);
		
	}

	private void maximumSubarray(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		int len= nums.length;
        int start =0;
        int  maxSum = Integer.MIN_VALUE;
        int sum= 0;
        int d =0;
        
        for(int i=0;i<k;i++)
        {
            sum += nums[i];
            
        }
        
        maxSum= sum;
        for(int j=k;j<len;j++)
        {   
            sum= sum + nums[j];
            sum= sum - nums[start++];
            maxSum = Math.max(maxSum,sum);
            
        }
        System.out.print(maxSum);
	}
	
}
