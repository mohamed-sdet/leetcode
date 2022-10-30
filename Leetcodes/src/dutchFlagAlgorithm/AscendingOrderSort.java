package dutchFlagAlgorithm;

import java.util.Arrays;

import org.junit.Test;

public class AscendingOrderSort {
	
	  /*Three Pointers || Dutch Flag Algo
	   * Set Three pointers, Left , Right and Middle
	   * Initialize Left as 0,middle as 0 and right as input length-1
	   * Iterate loop and while iterate check for given condition with middle value
	   * If middle value==left value swap left and middle value then increment left
	   * If middle value==middle value then increment middle pointer
	   * If middle value == right value then swap middle and right value then decrement right
	   * Finally return same output value
	   */
	
	
	
	
	
	@Test
	public void examplePositiveData()
	{
		int[] nums = {1,2,0,1,2};
		int[] k = {0,1,2};
		
		ascendingOrderSort(nums);
		
		
	}

	private void ascendingOrderSort(int[] nums) {
		// TODO Auto-generated method stub
		
		
		int left=0,middle=0,right=nums.length-1,temp=0;
		
		while(middle<=right)
		{
			if(nums[middle]==1) middle++;
			else if(nums[middle]==2)
			{
				temp = nums[middle];
				nums[middle]=nums[left];
				nums[left]=temp;
				left++;
			}else
			{
				temp=nums[right];
				nums[right]=nums[middle];
				nums[middle]= temp;
				right--;
			}	
		}
		System.out.print(Arrays.toString(nums));
	}
}
