package recollect;

import org.junit.Test;

public class Fibonacci {
	
	@Test
	public void exampleData()
	{
		int num =2;
		
		findFibonacci(num);
				
	}

	private void findFibonacci(int num) {
		// TODO Auto-generated method stub
		
		int sum=0,firstNum=0,secNum=1;
		
		for(int i=0;i<num;i++)
		{
			sum =firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
		}
		System.out.print(sum);
	}

}
