package arrays;

import org.junit.Test;

public class FindTheIndices {
	
	@Test
	public void example1()
	{
		int [] num = {2,7,11,15};
		
		int target= 9;
		
		indices_BruteFroce(num,target);
		
	}
	
	private void indices_BruteFroce(int[] num,int target)
	{
		int temp;
		for(int i=0;i<=num.length-1;i++)
		{
			temp=num[i]+num[i+1];
			
			if(temp==target)
			{
				
				
				System.out.println(i );
				System.out.println(i+1 );
			}
			
		}
		
	}

}
