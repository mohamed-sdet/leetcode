package twoPointers;

import java.util.Arrays;

import org.junit.Test;

public class RemoveElement {
	
	/*27. Remove Element
	 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

*/
	
	
	/* Initialize right and left index by zero 
	 * start while loop with a condition right < nums lenght 
	 * check if condition if right of nums not matches k then swap it 
	 * 
	 */
		@Test
		public void examplePositive()
		{
			int [] nums = {3,2,2,3};
			int val = 3;
			
			
			removeElement(nums,val);
		
		}
		@Test
		public void examplePositive2()
		{
			int [] nums = {0,1,2,2,3,0,4,2};
			int val = 2;
			
			
			removeElement(nums,val);
		
		}

	private void removeElement(int[] nums, int val) {
		// TODO Auto-generated method stub
		
		int left =0;
		int right =0;
		int count =0;
		while(right<nums.length)
		{
			if(nums[right]!=val)
			{
				int temp = nums[right];
				nums[right]= nums[left];
				nums[left++] = temp;
				count++;
			}right++;
			
			
		}
		System.out.print(Arrays.toString(nums)+" "+count);
		
	}
		
		
	
	
	
	

}
