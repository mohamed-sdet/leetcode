package map;

import java.util.HashSet;

import org.junit.Test;

public class SumofUniqueElements {

	
	//https://leetcode.com/problems/sum-of-unique-elements/
	
	
	/*Iterate the given values in Set 
	 * While Iterating add the duplicate values in another set 
	 * Now check the given int in set 1 then add the set values 
	 * Return the sum 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	@Test
	public void examplepositiveData()
	{
		int [] nums = {1,2,3,2};
		
		sumofUniqueElements(nums);
		
	}
	
	@Test
	public void exampleEdgeData()
	{
		int [] nums = {10,6,9,6,9,6,8,7};
		
		sumofUniqueElements(nums);
		
	}

	private int sumofUniqueElements(int[] nums) {
		// TODO Auto-generated method stub
		

        HashSet<Integer> set = new HashSet<>();
        
        HashSet<Integer> dup = new HashSet<>();
        
        int sum=0;
        boolean remove = false;
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                set.remove(nums[i]);
                remove = true;
                dup.add(nums[i]);
            }else if(!dup.contains(nums[i]))
            {
                set.add(nums[i]);
               
            }   
            
        }
        
        if(set.size()<=1 && remove==true) return sum;

        for(int j=0;j<nums.length;j++)
        {
        	if(set.contains(nums[j]))
        	{
        		sum  += nums[j];
        	}
        }
        
		
       System.out.print(sum);
       
       return sum;
	}
	
}
