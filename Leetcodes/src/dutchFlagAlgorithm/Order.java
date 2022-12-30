package dutchFlagAlgorithm;

import java.util.Arrays;

import org.junit.Test;

public class Order {
	
	@Test
	public void examplePositiveData()
	{
		int [] nums = {3,3,3,2,1,2,2,1,1};
		
		dutchFlag(nums);
		
	}

	private void dutchFlag(int[] nums) {
		// TODO Auto-generated method stub
		int left=0;int right=nums.length-1; int mid=0;
		
		while(mid<=right) 
		{
			if(nums[mid]==2)
			{
				mid++;
			}else if(nums[mid]==1)
			{
				int temp = nums[left];
				nums[left++] = nums[mid];
				nums[mid++] = temp;
			}else 
			{
				int temp = nums[right];
				nums[right--] = nums[mid];
				nums[mid]=temp;
			}
			
		}
		System.out.print(Arrays.toString(nums));
		
		
		
	}

}
