package twoPointers;

import java.util.Arrays;

import org.junit.Test;

public class DuplicateZeros {
	
	
	/*Iterate given input string 
	 * if it contains of 0 add another 0
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void examplePositiveData()
	{
		int[] arr = {1,0,2,3,0,4,5,0};
		duplicateZeros(arr);
	}

	private void duplicateZeros(int[] arr) {
		// TODO Auto-generated method stub
		
		int right=0,counter=0;
		
		int [] output = new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			if(counter<arr.length)
			{
				
				if(arr[i]!=0)
				{
					output[counter]= arr[i];
					counter++;
				}else
				{
					counter =counter+2;
				}
				
			}
		}
		 
		for(int j=0;j<output.length;j++)
			arr[j] = output[j];
		
		System.out.print(Arrays.toString(output));
		
	}
	
	

	
}
