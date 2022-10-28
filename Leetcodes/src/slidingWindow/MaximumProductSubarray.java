package slidingWindow;

public class MaximumProductSubarray {
	
	
	
	/*Traverse input array 
	 * if nums.lenght less than 1 return same value
	 * set left = 0 and right =1
	 * move right and product the left value and store in max
	 * if start or end value is equal to 0 skip 
	 * 
	 */
	
	
	public examplePositiveData()
	{
		int [] nums = {2,3,-2,4};
		MaximumProductSubarray(nums);
	}

	private void MaximumProductSubarray(int[] nums) {
		// TODO Auto-generated method stub
		
		int product=1;
		int max= Integer.MIN_VALUE;
		
		
	    for(int left=0;left<nums.length;left++)
	    {
	    	if(nums[left]==0)
	    	{   product=1;
	    	}
	    	product= product * nums[left];
	    	max= Math.max(max,product);	
	    	
	    	
	    }
	    product=1;
	    for(int right=nums.length-1;right>=0;right--)
	    {
	    	if(nums[right]==0)
	    	{   product=1;
	    	}
	    	product= product * nums[right];
	    	max= Math.max(max,product);
	    }
		
	}
	
		

}
