package sort;

import java.util.Arrays;

import org.junit.Test;

public class InsertionSort {

	@Test
	public void exampleData()
	{
		
		int [] nums = {2,1,4,3,6,5,8,7,9,8};
		
		insertionSort1(nums);
		
	}
	@Test
	public void exampleData1()
	{
		
		int [] nums = {1,2,4,3,5};
		
		insertionSort1(nums);
		
	}

	private void insertionSort(int[] nums) {
		// TODO Auto-generated method stub
		
	
	        for (int i = 0; i < nums.length; i++) 
	        {
	            int pivot = nums[i];
	            int j = i - 1;
	            while (j >= 0 && nums[j] > pivot)
	            {
	            	nums[j + 1] = nums[j];
	                j = j - 1;
	            }
	            nums[j + 1] = pivot;
	        }
	      
	        System.out.print(Arrays.toString(nums));
	        
		
	}
	
	
	private void insertionSort1(int[] nums)
	{
		int temp=0;
		int temp1=0;
		int j=0;
		for(int i=0;i<nums.length-1;i++)
		{
		  if(nums[i]>nums[i+1])
		  {
		        temp = nums[i+1];
				nums[i+1] = nums[i];
				nums[i]= temp;
			
		  }
		  else 
		  {
		      continue;
		  }
		  j=i;
		  
		  //1,2,4,3,5
		  //1,2,3,4,5
		  // 1,2,3,4,5
		    while(j !=0)
			{
			if(nums[j]<nums[j-1])
			{
			temp1 = nums[j-1];
				nums[j-1] = nums[j];
				nums[j]= temp1;
				j--;
			
			}else
				{break;}
			
			}
	
		  }
		
		System.out.print(Arrays.toString(nums));
		}
	}

