package easyProblems;

import java.util.Arrays;

import org.junit.Test;

public class Sorting {
	
	@Test
	public void exampleData() 
	{
		int[] nums = {2,1,3,5,4,6,8,7};
		
		sortOptimized(nums);
	}

	private void sortArray(int[] nums) {
		// TODO Auto-generated method stub
		
		int [] out = new int[nums.length];
		int counter=0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=1;i<nums.length;j++)
			{
				if(nums[i]<nums[j])
				{
					out[counter++]=nums[j];
					
				}else 
				{
					out[counter++]=nums[i];
				}
				System.out.print(out);
				
			}
		}
		 for (int i = 0; i <nums.length; i++) {     
	          for (int j = i+1; j <nums.length; j++) {     
	              if(nums[i] >nums[j]) {      
	                int  temp = nums[i];    
	                 nums[i] = nums[j];    
	                 nums[j] = temp;    
	               }     
	            }  
		
		
	}
	}

	
	private void sortOptimized (int[] nums)
	{
		
		int count=0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
					int  temp = nums[i];    
	                 nums[i] = nums[j];    
	                 nums[j] = temp; 
	                 
	                 if(nums[j]<nums[i])
	 				{
	 				  
				    }
				//System.out.print(Arrays.toString(nums));
			}
		}
		System.out.println(Arrays.toString(nums));
		
		for(int i = 0; i < nums.length - 1; i++) {
			int idx = i;
			
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] < nums[j])
					idx = j;
			}
			
			 int temp = nums[i];
			 nums[i] = nums[idx];
			 nums[idx] = temp;
			
		}
		
		System.out.println(Arrays.toString(nums));
		
	}


	
	
}

