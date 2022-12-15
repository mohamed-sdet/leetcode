package twoPointers;

import java.util.Arrays;

import org.junit.Test;

public class SortArrayByParityII {
	
	@Test
	public void examplePositiveData()
	{
		
		int [] nums = {4,2,5,7};
		
		sortByParity(nums);
	}

	private void sortByParity(int[] nums) {
		// TODO Auto-generated method stub
		
		 int left=0,right=nums.length-1;
	        int[] output = new int[nums.length];
	        int oddcounter=1;
	        int evencounter=0;
	        while(left<=right)
	        {
	            if(nums[left] %2 ==0)
	            {
	               output[evencounter]= nums[left++];
	               evencounter = evencounter + 2;
	            }
	            if(nums[right] %2 !=0)
	            {
	              output[oddcounter]= nums[right--];
	              oddcounter= oddcounter+2;
	            }
	        }
	        System.out.print(Arrays.toString(output));

	}

}
