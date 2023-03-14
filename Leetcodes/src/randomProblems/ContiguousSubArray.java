package randomProblems;

import org.junit.Test;

public class ContiguousSubArray {
	

	 /*
	  * Given an array of positive numbers and a positive number ‘S,’ 
		find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0 if no such subarray exists.
		2 approaches of above problem
	  */
	
	@Test
	 public void exampleData()
	 {
		 
		 int[] s = {4,4,3,1,2,3,4,6,5,4,8};
		 
		 int k =8;
		 
		 contiguousSubarray(s,k);
		 
	 }
	
	@Test
	 public void exampleData1()
	 {
		 
		 int[] s = {1,2,2,1,2};
		 
		 int k =4;
		 
		// findSumSlidinWindow(k,s);
		 contiguousSubarray(s,k);
		 
	 }

	private void contiguousSubarray(int[] s, int k) {
		// TODO Auto-generated method stub
		
		 int sum =0;
		 int left=0;
		 int min = Integer.MAX_VALUE;
		 for(int i=0;i<s.length;i++)
		 {
			 sum += s[i];
			 if(sum>k)
			 {
				 sum  = sum - s[left];
			 }
			 
			 if(sum == k)
			 {
				min = Math.min(min, i-left); 
			 }
		 }
		 
		System.out.print(min);
		
		
	}
	
	public static void findSumSlidinWindow(int s, int[] arr) {
		 int sum = 0;
		 int left = 0, right = 0;
		 int min = Integer.MAX_VALUE;
		 
		for(int i = 0; i < arr.length; i++) {
			
			sum = sum + arr[i];
			
			while(sum >= s) {
				min = Math.min(min, i - left + 1);
				sum = sum - arr[left++];			
			}
			
		}
		if(min == Integer.MAX_VALUE)
			System.out.println(0);
		else
			System.out.println(min);
		 
	 }
	 
	 

}
