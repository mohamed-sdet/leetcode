package problems;

import java.util.Arrays;

import org.junit.Test;

public class MergeArrays {

	@Test
	public void postiveData()
	{
		
		int[] nums1 = {1,3,5,8,9};
		int [] nums2 = {2,4,7};
		mergeArray(nums1,nums2);
	}

	private void mergeArray(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		
		int left = 0;
		int right =0;
		int [] output = new int[nums1.length+nums2.length];
		int counter =0;
		while(left<nums1.length || right<nums2.length)
		{
			
			if(left==nums1.length && right<nums2.length )
			{
				output[counter++]= nums2[right++];
			}else if(right== nums2.length && left<nums1.length)
			{
				output[counter++] = nums1[left++];
			}
			else if(nums1[left]<=nums2[right])
			{
				output[counter++]= nums1[left];
				left++;
			}else 
			{
				output[counter++] = nums2[right];
				right++;
			}
			
		}
		
		System.out.print(Arrays.toString(output));
		
	}
	
}
