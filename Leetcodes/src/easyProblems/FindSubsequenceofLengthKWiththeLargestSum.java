package easyProblems;

import org.junit.Test;

public class FindSubsequenceofLengthKWiththeLargestSum {

	//https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/
	
	
	/*
	1) Add first k elements and have a sum
	2) loop from k element until end 
	    a) subtract the first element from the sum
	    b) add the new element to the sum
	    c) compare with existing sum --> whichever max --> make it max
    */
	@Test
	public void positivedata()
	{
		int[] nums = {2,1,3,3};
		int k=2;
		findSubsequenceofLengthKWiththeLargestSumSlidingWindow(nums,k);
	}
	@Test
	public void positivedata1()
	{
		int[] nums = {1,5,2,3,7,1};
		int k=3;
		findSubsequenceofLengthKWiththeLargestSumSlidingWindow(nums,k);
	}
	
	@Test
	public void edgeCase() {
		int[] nums = {8,4,2,3,11,15,2,1};
		int k = 2;
		findSubsequenceofLengthKWiththeLargestSumSlidingWindow(nums, k);
	}

	private void findSubsequenceofLengthKWiththeLargestSumSlidingWindow(int[] nums, int k){
		
		int sum= 0,maxsum=0;
		for(int i=0;i<k;i++)
			sum += nums[i];

		maxsum=sum;
		for(int j=k;j<nums.length;j++)
		{ int n=sum - nums[j-k];
			sum =  n + nums[j] ;
			maxsum = Math.max(maxsum, sum);
		}
		System.out.println(maxsum);
	}
}


