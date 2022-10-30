package dutchFlagAlgorithm;

import java.util.Arrays;

import org.junit.Test;

public class Descendingordersort {
	
	
	/*Three Pointers || Dutch Flag 
	 * Set Three pointers Left Middle and Right
	 * set left =0; right=nums lenght -1
	 * 
	 * 
	 */
	
	
	@Test
	public void examplePositiveData()
	{
		int[] nums = {1,2,0,1,2};
		int[] k = {0,1,2};
		
		Descendingordersort(nums);
		
		
	}

	private void Descendingordersort(int[] nums) {
		// TODO Auto-generated method stub
		
		int left=0,middle=0,right=nums.length-1,temp=0;
		
		while(middle<=right)
		{
			if(nums[middle]==1) middle++;
			else if(nums[middle]==2)
			{
				temp = nums[middle];
				nums[middle++]=nums[left];
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
	


