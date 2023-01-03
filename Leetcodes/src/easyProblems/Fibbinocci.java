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
		
		int first =0,secNum=1,temp=0;
		for(int i=0;i<n;i++)
		{
			temp = first + secNum;
			first  = secNum;
			secNum=temp;
			
			System.out.println(temp);
			
		}
	}

}
