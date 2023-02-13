package practice;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {

	//https://leetcode.com/problems/contains-duplicate-ii/
	public void exampleData()
	{
		int[] nums = {1,2,3,1};
		int k=3;
		
		nearByDuplicateMap(nums, k);
	}

	private boolean nearByDuplicate(int[] nums,int k) {
		// TODO Auto-generated method stub
		 HashSet<Integer> set = new HashSet<>();

         for(int i=0;i<nums.length;i++)
         {
              if(!set.add(nums[i]))
              {
                  return true;
              }
              if(set.size()>k)
              {
                  set.remove(nums[i-k]);
              }
             
         }

         return false;
	}
	
	private boolean nearByDuplicateMap(int[] nums,int k)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
         
         for(int i=0;i<nums.length;i++)
         {

             if(map.containsKey(nums[i]))
             {
                 if(Math.abs(i-map.get(nums[i])) <=k)
                 {
                  return true;
                 }
             }
              map.put(nums[i],i);
         }
 
        return false;
	}
}
