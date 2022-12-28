package assesment;

import java.util.Arrays;

import org.junit.Test;

public class Ass_removeDuplicate {

	//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
	
	
	 /* Algorithm solve this using two pointers Approach 
    Initialize counter 
    Initialize left pointer as zero 
    Initialize right pointer as one 
    Initialize while loop with breaking condition as right lesser of length
    check left and right values by subtracting and check for not equal to zeros 
    then assign right value to nums and return count 
    */

    //time = O(n)
    //space =O(1)
	@Test
	public void examplePostiveData()
	{
		
		int [] nums = {1,1,2};
		
		removeDuplicate(nums);
		
	}

	private void removeDuplicate(int[] nums) {
		// TODO Auto-generated method stub
		
		  int left=0;
	       int right =1;
	       int count=1;

	      while(right<nums.length)
	      {
	          if(nums[right]-nums[left]!=0 )
	          {
	              nums[++left]=nums[right];
	              count++;
	          }
	              right++;
	      }
	      System.out.print(count);
	    }
    
	private void bruteforce(int [] nums)
	{
		int counter =0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				
				if(nums[i] != nums[j])
				{
					nums[counter++]= nums[j];
				}
			}
			
		}
		System.out.print(Arrays.toString(nums));
	}
}
