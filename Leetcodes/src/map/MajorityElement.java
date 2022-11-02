package map;

import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class MajorityElement {
	
	
	@Test
	public void examplePositiveData()
	{
		int[] nums = {6,6,6,7,7};
		
		MajorityElementMap(nums);
		
	}

	private void MajorityElement(int[] nums) {
		
		int output=0;
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length-1;j++)
			{
				if(nums[i]==nums[j])
				{
					
					output=nums[i];
				}
				
			}
			
		}
		
		System.out.print(output);
		
		
	}
	
	private void MajorityElementMap(int[] nums)
	{
		int len= nums.length/2; 
		int output =0;
		HashMap<Integer,Integer> sMap = new HashMap<>();
		
		for(int i=0;i<nums.length;i++)
		{
			sMap.put(nums[i], sMap.getOrDefault(nums[i], 0)+1);
	
		}
		
		for(Entry<Integer, Integer> entry : sMap.entrySet() )
		{
			if(entry.getValue()>len)
			{
				output=entry.getKey();
			}
			
		}
		System.out.print(output);
		
	}
	
	
	
	

}
