package assesment;

import org.junit.Test;

public class ConvertIntegertotheSumofTwoNoZeroIntegers {
	
	
	
	/*Brute Force 
	 * Loop the given value using for loop 
	 * minus the given value by 1, and store the value in the output 
	 * now use mod operator then check value is zero if zero then dive n value -1
	 * return output
	 */
	
	@Test
	public void exampleDataPositive()
	{
			int n =2;
			ConvertIntegertotheSumofTwoNoZeroIntegers(n);
			
	}
	
	public void exampleDataEdge()
	{
			int n =0;
	}
	public void exampleDataNegative()
	{
			int n =-2;
	}
	
	private int[] ConvertIntegertotheSumofTwoNoZeroIntegers(int n) {
		// TODO Auto-generated method stub
		
		int array;
		int [] output = new int[2];
		for(int i=1;i<n;i++)
		{
			
			array= n-i;
			
			if(array%10 !=0 && i%10 !=0 )
			{
				output[0]= array;
				output[1]=i ;
				
				return output;
				
			}
			
		}
		return output;
	
		
	}
	
	
	
	
	
	

}
