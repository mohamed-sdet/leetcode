package slidingWindow;

import org.junit.Test;

public class MaximumAverageSubarrayI {
	
	@Test
	public void example1()
	{
		
		int[]  nums = {1,2,2,2,4,7};
		int k = 2;
		//		Output: 12.75000
		// Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
		findMaxAverage(nums,k);
	}
	
	public double findMaxAverage(int[] nums, int k)
	{
		
		 int len= nums.length;
	        int start =0;
	        int  maxSum = Integer.MIN_VALUE;
	        int sum= 0;
	        int d =0;
	        
	        for(int i=0;i<k;i++)
	        {
	            sum += nums[i];
	            System.out.println("i"+ i+ "is" + nums[i] );
	            System.out.println("sum"+ sum+ "is" + sum );
	        }
	        
	        maxSum= sum;
	        for(int j=k;j<len;j++)
	        {
	        	
	        	System.out.println("i"+j+ "is" + nums[j] );
	            
	            sum= sum + nums[j];
	            sum= sum - nums[start++];
	            maxSum = Math.max(maxSum,sum);
	            
	        }
	        
	        
	       // d= maxSum/k;
	        System.out.print(d);
	        return d;
	        
	        
	}

}
