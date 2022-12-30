package assesment;

import org.junit.Test;

public class Ass1_SlidingWindow_ContainsDuplicateII {
	
	
	public void examplepostiveData()
	{
		int[] nums = {1,2,3,1};
		int k =2;
		
		
		ContainsDuplicate(nums,k);
	}

	@Test
	public void exampleEdgeData()
	{
		int[] nums = {1,2,3,1,2,3};
		int k =2;
		
		
		ContainsDuplicate(nums,k);
	}
	private boolean ContainsDuplicate(int[] nums,int k) {
		// TODO Auto-generated method stub
		int left=0;
        int diff=0;
        int right=1;
    
         while(right<=nums.length)
         {
          if(nums[left]==nums[right])
          {
              diff = Math.abs(right-left);
              if(diff<=k)
              {
                  System.out.print("true");
                  break;
              }
          }
              right++;

          if(right==nums.length)
          {
              left++;
              right= left;
          }
      }
		return false;

	}

}
