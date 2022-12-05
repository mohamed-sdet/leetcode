package binarySearch;

import org.junit.Test;

public class FibonacciNumber {

	@Test
	public void positiveexampleData()
	{ 
		
		int n=2;
		int value = fibonacciNumber(n);
		
	}

	private int  fibonacciNumber(int n) {
		// TODO Auto-generated method stub
		 if(n==0 || n==1)
	        {
	            return n;
	        }else
	        
	       {
	            return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
	        }
	}
	
}
