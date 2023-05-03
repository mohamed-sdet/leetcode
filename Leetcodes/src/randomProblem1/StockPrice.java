package randomProblem1;

import org.junit.Test;

public class StockPrice {
	
	
	@Test
	public void exampleData()
	{
		int [] Price = {1,2,3,4,5,8,9,1,3,6,9};
		exampleData(Price);
	}
	
	public void exampleData(int [] price)
	{
		int min = price[0];
		int max = 0;
		
		for(int i=1;i<price.length;i++)
		{
			if(min >price[i])
			{
				min = price[i];
			}else if(price[i] -min>max)
			{
				max = price[i] -min;
			}
			
		}
		   System.out.print(max);
		
	}

}
