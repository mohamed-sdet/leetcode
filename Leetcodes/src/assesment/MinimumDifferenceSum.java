package assesment;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class MinimumDifferenceSum {
	
	@Test
	public void examplePositiveTestData()
	{
		int[] arr = {1,3,3,2,4};
		int n=5;
		minimumDifferenceSum(arr);
				
	}

	private void minimumDifferenceSum(int[] arr) {
		// TODO Auto-generated method stub
		
		int sum=0;
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println(i +"-"+arr[i]);
			
			sum= sum+Math.abs(arr[i]-arr[i+1]);
		}
		
		System.out.print(sum);
		
		
		
	}

}
