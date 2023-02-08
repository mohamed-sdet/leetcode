package recollect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class MergeArrays {
	
	@Test
	public void exampleData()
	{
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		

		mergeArray(nums1,nums2);
	}
	
	@Test
	public void exampleData2()
	{
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		

		mergeArray(nums1,nums2);
	}

	private void mergeArray(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		
		int left =0;
		int right =0;
		int num1length = nums1.length;
		int nums2length = nums2.length;
		//Arrays.sort(nums1);
		//Arrays.sort(nums2);
		Set<Integer> set = new HashSet<>();
		while(left<num1length && right<nums2length)
		{
			
			if(nums1[left] == nums2[right])
			{
				if(!set.contains(nums1[left]))
				set.add(nums1[left]);
				left++;
				right++;
			}else if(nums1[left]<nums2[right])
			{
				left++;
			}else
			{
				right++;
			}
		}
		
		System.out.print(set);
		
		
	}
	
	private void mergeArraySet(int[] nums1,int[] nums2)
	{

		
		Set<Integer> s1 = new HashSet<Integer>();
        Set<Integer> s2 = new HashSet<Integer>();
        for(int i : nums1){
            s1.add(i);
        }
        for(int i : nums2){
            s2.add(i);
        }
        s1.retainAll(s2);
        int[] arr= new int[s1.size()];
        int j = 0;
        for(int i : s1) {
            arr[j] = i;
            j++;
        }
        System.out.print(arr);
		
		
	}
}
