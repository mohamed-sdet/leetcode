package map;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class FindAllNumbersDisappearedinanArray {
	
	/*Solve using Hashing 
	 * Initialize hashset 
	 * Iterate given input string and store the values in hash set
	 * Again iterate and find the missing values in the set 
	 * While iterating compare with the given loop of j then return the missing value
	 * 
	 * 
	 */
//	@Test
	public void examplePositiveData()
	{
		
		int[]  nums = {4,3,2,7,8,2,3,1};
		findAllNumbersDisappearedinanArray(nums);
		
	}
	
	@Test
	public void exampleEdgeData()
	{
		
		int[]  nums = {1,1};
		findAllNumbersDisappearedinanArray(nums);
		
	}

	private void findAllNumbersDisappearedinanArray(int[] nums) {
		// TODO Auto-generated method stub
		
		int [] output =new int [2];
		int counter =0;
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<nums.length;i++)
		{
			set.add(nums[i]);

			
		}
		System.out.print(set);
		for(int j=1;j<=nums.length;j++)
		{
			
		    if(!set.contains(j))
		    {
		    	output[counter]=j;
		    	counter++;
		    }
			
		}
		
		System.out.print(Arrays.toString(output));
	}
	


}
