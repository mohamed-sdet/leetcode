package arrayList;

import java.util.Arrays;

import org.junit.Test;

public class NondecreasingOrder {
	
	@Test
	public void examplePositiveData()
	{
		
		int [] nums= {1,2,0,1,2};
		
		NondecreasingOrder(nums);
		
		
	}

	private void NondecreasingOrder(int[] nums) {
		// TODO Auto-generated method stub
		
		int start=0;
		int end=1;
		int temp=0;
		while(end<nums.length)
		{
			if(nums[start]> nums[end] )
			{
				temp=nums[end];
				nums[end]= nums[start];
				nums[start]= temp;
				end++;
			} else if(nums[start]< nums[end])
			{
				start++;
			}
			else start++; end++;
			
			
			
			
		}
		
		System.out.print(Arrays.toString(nums));
	}
	

}
