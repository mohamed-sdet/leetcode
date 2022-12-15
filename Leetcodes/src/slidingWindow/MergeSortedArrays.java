package slidingWindow;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortedArrays {
	
	@Test
	public void exampleData()
	{
		
		int [] nums1 = {1,2,3,0,0,0};
		int [] nums2 = {2,5,6};
		
		mergeSortedArrays(nums1,nums2);
	}

	private void mergeSortedArrays(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		
		int left=0;
        int right =0;
        int count =0;

        int out[] = new int[nums1.length+nums2.length];
        

        while(left<nums1.length || right<nums2.length)
        {

            if(left==nums1.length)
            {
                out[count++] = nums2[right++];
            } 
            else if(right == nums2.length)
            {
                out[count++] = nums1[left++];
            }
            else if( nums1[left] !=0 && nums1[left] <= nums2[right])
            {
                out[count++] = nums1[left];
                
                left++;
            }else if( nums2[right] !=0 && nums1[left] >= nums2[right])
            {
                out[count++] = nums2[right];
                
                right++;
            }
		
		
	}
        
        System.out.println(Arrays.toString(out));

	

}
}
