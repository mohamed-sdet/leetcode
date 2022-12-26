package slidingWindow;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ContainsDuplicateII {
	
	@Test
	public void exampleData()
	{
		int [] nums = {1,2,3,1};
		int k = 3;
		
		containsDuplicate(nums, k);
	}

	public  boolean  containsDuplicate(int[] nums, int k) {
		// TODO Auto-generated method stub
		 Set<Integer> set = new HashSet<Integer>();
	        for(int i = 0; i < nums.length; i++){
	            if(i > k) 
	            	{
	            	set.remove(nums[i-k-1]);
	            	}
	            if(!set.add(nums[i]))
	            {
	            return true;
	            }
	        }
	        return false;
		
	}

}
