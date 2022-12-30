package dutchFlagAlgorithm;

import java.util.Arrays;

import org.junit.Test;

public class Range {
	
	@Test
	public void examplePostive()
	{
		int [] nums = {1,2,3,4,4,5,5,6,7,8,9,};
		
		rangedutchFlag(nums);
		
		
	}

	private void rangedutchFlag(int[] nums) {
		// TODO Auto-generated method stub
		
		int left=0; int right=nums.length-1; int  mid=0;
		
		while(mid<=right)
		{
			if(nums[mid]>= 1 && nums[mid] <=3 )
			{
				mid++;
			}else if(nums[mid]>=4 && nums[mid]<=5)
			{
				int temp = nums[left];
				nums[left++] = nums[mid];
				nums[mid++] = temp;
			}else if(nums[mid]>=6 && nums[mid]<=9)
			{
				int temp = nums[right];
				nums[right--] = nums[mid];
				nums[mid] = temp;
				
			}
			
		}
		System.out.print(Arrays.toString(nums));
		
	}

}
