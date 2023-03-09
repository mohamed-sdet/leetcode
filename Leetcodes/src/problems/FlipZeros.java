package problems;

import org.junit.Test;

public class FlipZeros {
	
	
	@Test
	public void postiveData()
	{
		int [] nums = {1,1,1,1,0,0,1,1,1,0};
		int k=2;
		
		longestCOnsecutiveOnes(nums,k);
		
		
	}

	private void longestCOnsecutiveOnes(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		int sum =0;
		int left =0;
		for(int i=0;i<nums.length;i++)
		{
			 if(nums[i]==0)
			 {
				 k--;
			 }
			
			 if(k<0)
			 {
				 if(nums[left]==0)
				 {
					 k++;
				 }
				 left++;
			 }
			 
			 sum = Math.max(sum, i-left+1);
		}
		
		System.out.print(sum);
	}

}
