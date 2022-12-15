package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class IntersectionofTwoArraysII {
	
	@Test
	public void examplePositiveData()
	{
		
		int [] nums1 = {1,2,2,1};
		int [] nums2= {2,2};
		
		intersectionOfTwoArrays(nums1,nums2);
	}
	@Test
	public void exampleEdgeData()
	{
		
		int [] nums1 = {4,9,5};
		int [] nums2= {9,4,9,8,4};
		
		intersectionOfTwoArrays(nums1,nums2);
	}
	
	

	private void intersectionOfTwoArrays(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		
		 HashSet<Integer> set = new HashSet<>();
		    
	        List<Integer> list = new ArrayList<>();

	        for(int i=0;i<nums2.length;i++)
	        {
	           set.add(nums2[i]);
	        }
	        for(int i=0;i<nums1.length;i++)
	        {
	            if(set.contains(nums1[i]))
	            {
	                list.add(nums1[i]);
	            }
	        }
	        
	        int [] out = new int[list.size()];
	        int count=0;
	        for(int  i : list) out[count++]= i;
	        
	        
	        System.out.print(Arrays.toString(out));


	        
		
	}

}
