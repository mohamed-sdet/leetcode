package twoPointers;

import org.junit.Test;

public class ArrayIntersection {
	
	
	/* Two pointer start and end set to zero index 
	 * composer start and end if both value return and  increment  right and left  
	 * if left<right increment left , if left>right
	 */
	@Test
	public void examplePositive()
	{
		int[] nums1 = {2,3,5,6,8,10};
		int[] nums2 = {2,4,5,7,8};
		intersection(nums1,nums2);
	}

	private void intersection(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
			int right=0 , left = 0;
			
			while(left<nums1.length && right<nums2.length)
			{
				if(nums1[left] == nums2[right])
				{
					System.out.println(nums1[left] );
					System.out.println( "equal" );
					left++;
					right++;
					continue;
				}else if(nums1[left]<nums2[right]) left++;
				else right++;
			}
	}
}
