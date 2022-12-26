package easyProblems;

import org.junit.Test;

public class Factorial {
	
	
	@Test
	public void examplePostiveData()
	{
		int s = 5;
		
		factorial(s);
	}

	private void factorial(int s) {
		// TODO Auto-generated method stub

		int temp =1;
		for(int i=1;i<=s;i++)
		{
			temp = temp*i;
		}
		
		System.out.print(temp);
		
	}

}
