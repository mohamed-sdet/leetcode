package map;

import java.util.HashMap;

import org.junit.Test;

public class NumberofArithmeticTriplets {
	
	
	/* Initialize hash map for the given input string 
	 * Iterate the given input using for loop and store the given iput string in map with occurance 
	 * now get the values from map and check condition 
	 *  		a) getvalues of map the - by k store it in temp 
	 *  		b) now check for the  temp values in map if present getvalues if it contains then store it in temp 2 by -k value 
	 *  		c) now again check for the temp 2 value if its present then increase counter 
	 *  Now return counter value 
	 */
	
	@Test
	public void  examplePositiveData()
	{
		int[] nums = {0,1,4,6,7,10};
		int diff=3;
		numberofArithmeticTripletsHashMap(nums,diff);
		
		
	}

	private void numberofArithmeticTripletsHashMap(int[] nums,int diff) {
		// TODO Auto-generated method stub

		int output=0;
		HashMap<Integer,Integer> map = new HashMap();
		for(int i=0;i<nums.length;i++)
		{
			 map.put(nums[i], i);
			 
			int temp = nums[i]-diff;
			int temp2= temp -diff;
			if(map.containsKey(temp) && map.containsKey(temp2) )
			{
				output++;
			}
		}
		System.out.print(output);

	}

}
