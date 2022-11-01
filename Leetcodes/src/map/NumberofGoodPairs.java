package map;

import org.junit.Test;

public class NumberofGoodPairs {
	
	
	
	/*Traverse given input array 
	 * Use two for loop and iterate 
	 * Compare inner for loop i value with outer forloop j value 
	 * if both the value matches increment counter 
	 * finally return counter 
	 * 
	 */

	@Test
	public void examplePositiveData()
	{
		int[] nums = {1,2,3,1,1,3};
		numberofGoodPairs(nums);
		
	}

	private void numberofGoodPairs(int[] nums) {
		
		
		int counter=0;
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j]) counter++;
				
			}
			
		}
		
		System.out.print(counter);
	}
	
	
	
	
	
}
