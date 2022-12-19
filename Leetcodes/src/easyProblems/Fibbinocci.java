package easyProblems;

import org.junit.Test;

public class Fibbinocci {
	
	@Test
	public void exampleData()
	{
		
		int n= 11;
		
		fibbinocci(n);
	}

	private void fibbinocci(int n) {
		// TODO Auto-generated method stub
		
		int sum=0,firstNum=1,secNum=0;
		
		for(int i=0;i<n;i++)
		{
			sum = firstNum+secNum;
			firstNum= secNum;
			secNum=sum;
			System.out.println(sum);
		}
		
	}

}
