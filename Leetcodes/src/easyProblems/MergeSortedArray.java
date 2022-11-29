package easyProblems;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortedArray {
	
	
	@Test
	public void examplePostiveData()
	{
		
		 int [] nums1 = {1,2,4}, nums2 = {2,3,5};
		 
		 mergeSortedArray(nums1,nums2);
	}

	private void mergeSortedArray(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		
		int left =0,right=0,temp=0;
		
		
		
		int a = nums1.length, b=nums2.length;
		
		int[] output = new int[a+b];
		while(left < a || right < b)
		{
			if(left==a)
			{
				output[temp++]= nums2[right++];
			}else if(right==b)
			{
				output[temp++]=nums1[left];
			}else if(nums1[left]<=nums2[right])
			{
				output[temp++] = nums1[left++];
				
			}else
			{
				output[temp++]=nums2[right++];
			}
			
		}
		
		System.out.print(Arrays.toString(output));
	}

}
