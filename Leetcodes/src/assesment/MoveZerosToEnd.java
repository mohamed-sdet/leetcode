package assesment;

import java.util.Arrays;

import org.junit.Test;

public class MoveZerosToEnd {

	@Test
	public void PositiveData()
	{
	
		int nums[] = {0,1,0,3,12};
		
		moveZeroToEndOtimized(nums);
	}
	
	
	/* Traverse he input array 
	 * while traversing check the condition it has zero 
	 * if it has zero swap it  
	 * return the output
	 */

	private void moveZeroToEnd(int[] nums) {
		// TODO Auto-generated method stub
		
		int temp=0;
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==0)
				{
					temp= nums[j];
					nums[j]= nums[i];
					nums[i]= temp;					
				}
			}
		}
		System.out.print(Arrays.toString(nums));
	}
	
	private void moveZeroToEndOtimized(int[] nums)
	{
		
		int temp=0;
		int p1=0;
		int p2=nums.length-1;
		
		while(p1>=p2)
		{
			
			if(nums[p1]==0)
			{
				temp = nums[p2];
				nums[p2--]= nums[p1];
				nums[p1++]= temp;		
			}else
			{
				p1++;
				
			}
				
			
		}
		
		System.out.print(Arrays.toString(nums));
		
	}
}
