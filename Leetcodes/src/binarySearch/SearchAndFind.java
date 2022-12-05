package binarySearch;

import org.junit.Test;

public class SearchAndFind {


	
	//Input: nums = [-1,0,3,5,9,12], target = 9
	
/* Solve using Binary search 
 * find mid value by left-right
 * if mid value lesser than target then left = mid+1
 * if mid value greater than target then right = mid-1
 * 
 */
	@Test
	public void postivedata()
	
	{
		
		int [] nums = {-1,0,3,5,9,12} ;
		
		int target = 9;
		
		searchAndFind(nums,target);
	}

	private void searchAndFind(int[] nums, int target) {
		// TODO Auto-generated method stub
		
		int left =0, right=nums.length-1;
		
		
		
		while(left<=right)
		{
			
			int mid = left-right;
			
			if(nums[mid]<target)
			{
				left = mid+1;
			
		
				
			}else if(nums[mid]>target)
			{
				right= mid-1;
				
				
			}else if(nums[mid]==target)
			{
				
				System.out.print(mid);
				break;
			}
			
			
		}
		
		
		
	}
	
	
	
	
}
