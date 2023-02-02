package binarySearch;

import org.junit.Test;

public class FindNumber {
	
	
	@Test
	public void exampleData()
	{
		
		int[] nums = {1,2,3,4,8,9,22,28,88,99,100};
		int target=28;
		findNumber(nums,target);
	}

	private void findNumber(int[] nums,int target) {
		// TODO Auto-generated method stub
		
		int left=0,right=nums.length-1,mid;
		
		while(left<=right)
		{
			mid = (left+right)/2;
			
			if(nums[mid]==target)
			{
				System.out.print(mid);
				break;
			}else if(nums[mid]>target)
			{
				right=mid-1;
			}else 
			{
				left=mid+1;
			}
				
		}
	}

}
