package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class AreSmallerThantheCurrentNumber {

	private static final Object[][] areSmallerThantheCurrentNumber = null;

	@Test
	public void examplePositivedata()
	{
		int [] nums = {8,1,2,2,3};
		
		areSmallerThantheCurrentNumber(nums);
		
		//Assert.assertArrayEquals(areSmallerThantheCurrentNumber[int[] nums], new int[] [4,]);
		
	}
	
	@Test
	public void exampleEdgedata()
	{
		int [] nums = {7,7,7,7};
		
		areSmallerThantheCurrentNumber(nums);
	}
	
	@Test
	public void examplePostivedata()
	{
		int [] nums = {6,5,4,8};
		
		areSmallerThantheCurrentNumber(nums);
	}
		

	private int[] areSmallerThantheCurrentNumber(int[] nums) {
		
		
		 Map<Integer,Integer> map = new HashMap<>();
	        int cloneArray[] = nums.clone(); 
	        Arrays.sort(nums);
	       for(int i = 0 ; i < nums.length;i++) {
	           if(!map.containsKey(nums[i])) {
	               map.put(nums[i],i);
	           }
	            
	        }
	       
	       System.out.print(map);
	        int[] result = new int[nums.length];
	        for(int i = 0 ; i < cloneArray.length;i++) {
	           result[i] = map.get(cloneArray[i]); 
	        }
	        return result;

		// TODO Auto-generated method stub
		
	}
	
	
}
