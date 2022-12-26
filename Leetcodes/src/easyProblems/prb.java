package easyProblems;

import org.junit.Test;

public class prb {
	
	@Test
	public void test1() {
		int[] nums= {2,3,7,8,6,7,6,3,8,12,11,12,10};
		int findrating = findrating(nums);
		System.out.println(findrating);
		}

	private int findrating(int[] nums) {
		int r=0,l=0,length=0;
		
		while(r<nums.length) {
			
			while(r<nums.length && nums[r]>6) {
				r++;
			}
			length = Math.max(length, r-l);
			r++;
			l=r;
			
		}
		return length;
	}

}
