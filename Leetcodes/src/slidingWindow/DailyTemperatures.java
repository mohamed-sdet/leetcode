package slidingWindow;

import java.util.Arrays;

import org.junit.Test;

public class DailyTemperatures {
	
	
	@Test
	public void examplePostiveData()
	{
		int [] temperatures = {73,74,75,71,69,72,76,73};
		
		slowandFastPointer(temperatures);
		
	}
	
	@Test
	public void examplePostiveData2()
	{
		int [] temperatures = {55,38,53,81,61,93,97,32,43,78};
		
		slowandFastPointer(temperatures);
		
	}

	private void slowandFastPointer(int[] temperatures) {
		// TODO Auto-generated method stub
		
		
		//{55,38,53,81,61,93,97,32,43,78}
		 int left =0,right =left+1;
	        int counter=0;
	        int[] output = new int[temperatures.length];
	        while (right < temperatures.length && left!=temperatures.length)
	        {
	        	
	        if(temperatures[left]<temperatures[right] )
	        {
	             output[counter++] = right - left;
		        left++;
		        right=left+1;
	        }
	        else 
	        {
	         right++;
	        }
	        if(right==temperatures.length && left!=temperatures.length-1)
	        {
	        	output[counter++]=0;
	        	left++;
	        	right= left+1;
	        }
	   

	        }
	
	        System.out.print(Arrays.toString(output));

		
	}

}
