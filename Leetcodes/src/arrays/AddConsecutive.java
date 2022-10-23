package arrays;

import java.util.Arrays;

import org.junit.Test;

public class AddConsecutive {
	
	@Test
	public void examplePositive()
	{
		int nums[] = {1,2,3,5};
		
		addconsecutiveArry(nums);
		
	}
	

	public void addconsecutiveArry(int [] nums)
			{
		
		     int output[] =new int [nums.length-1];
		     int sum;
			 for(int i=0;i<nums.length-1;i++)
			 {
				 sum = nums[i]+nums[i+1];
				 output[i] = sum;
				 
			 }
		   System.out.print(Arrays.toString(output));
		
			}
	
	public void addconsecutiveArry1(int [] nums)
	{

     int output[] = {nums.length};
	 for(int i=0;i<nums.length-1;i++)
	 {
		 output[i] = nums[i]+nums[i+1]+nums[i+2];
		 
	 }
   System.out.print(Arrays.toString(output));

	}
	

}
