package recollect;

import org.junit.Test;

public class FindSubarrySum {
	
	@Test
	public void  exampleData()
	{
		int [] nums = {1,7,4,3,1,2,1,5,1};
		
		int k =7;
		subArrayMax(nums,k);
		
	}

	private void subArrayMax(int[] nums, int k) {
		// TODO Auto-generated method stub
		 int sum =0;
		 int left=0;
		 for(int i=0;i<nums.length;i++)
		 {
			 sum += nums[i];
			 
			 while(sum>k)
			 {
				 sum=sum-nums[left++];
				 
			 }
			 
			 if(sum==k)
			 {
				 System.out.println(left + " "+i);
			 }
			 
		 }
	}

}
