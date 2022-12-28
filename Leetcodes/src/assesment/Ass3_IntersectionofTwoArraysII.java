package assesment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Ass3_IntersectionofTwoArraysII {
	
	
	/* solve this using two pointer alogorithm
    Sort nums1 and nums2 using arrays sort 
    Intialize List to carry arrays values for output 
    Intialize left  and right as zero
    Intialize condition left and right condition not less than length of num1 and num2
    check for left and right value are equal 
      a) if equal add it to the list then increment right and left pointers 
      b) if not equal compare left and right value 
           i)if left lesser than right increment left 
           ii) if right lesser than left increment right 

    Once while loops breaks then iterate the list values into the out put arrays
    return output
 */

 //Time = O(n)
 //Space = O(n)
	
	
	@Test
	public void examplePositiveData()
	{
		int [] nums1 = {1,2,2,1};
		int [] nums2 = {2,2};
		
		bruteforce(nums1,nums2);
	}
	@Test
	public void exampleedgeData()
	{
		int [] nums1 = {1,2,2,1};
		int [] nums2 = {2};
		
		optimisedApproach(nums1,nums2);
	}

	private void bruteforce(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    list.add(nums1[i]);
                    break;
                }
            }
        }
        int out[] = new int[list.size()];
        for(int i =0;i<out.length;i++)
        {
            out[i]= list.get(i);
        }

        System.out.print(Arrays.toString(out));
	}

	
	private void optimisedApproach(int[] nums1, int[] nums2)
	{
	
     
     Arrays.sort(nums1);
     Arrays.sort(nums2);
     List<Integer>  list = new ArrayList<>();
 
      int left =0,right=0;

      while(left<nums1.length && right<nums2.length)
      {
          if(nums1[left] == nums2[right])
          {
              list.add(nums1[left]);
              left++;
              right++;
          } else if(nums1[left]<nums2[right])
          {
              left++;
          }else right++;

      }

      int out[] = new int[list.size()];
       for(int i =0;i<out.length;i++)
       {
           out[i]= list.get(i);
       }

       System.out.print(out);

	}
}
