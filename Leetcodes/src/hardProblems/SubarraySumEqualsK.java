package hardProblems;

import org.junit.Test;

public class SubarraySumEqualsK {

	
	/*Sliding window with slow and past pointer 
	 * 
	 * 
	 * 
	 */
	@Test
	public  void examplePostiveData()
	{
		
		int nums[] = {1,7,4,3,1,2,1,5,1}; 
		
		int target=7;
		
		subarraySumEqualsK(nums,target);
		
	}

	private void subarraySumEqualsK(int[] nums,int target) {
		// TODO Auto-generated method stub
		
		
		int sum=0;
		
		int left=0;
		
		for(int i=0;i<nums.length;i++)
		{
			sum = sum+ nums[i];
			
			while(sum>target)
			{
				
				sum = sum- nums[left++];
			}
			
			if(sum == target)
			{
				
				System.out.println(left+ " , " + i);
			}
			
		}
		
	}
	
	
	
	
}
