package recollect;

import org.junit.Test;

public class Find {

	@Test
	public void exampleData()
	{
		int nums =  10110011;
		
		recursion(nums);
	}

	private void recursion(int nums) {
		// TODO Auto-generated method stub
		
		System.out.print(count(nums));
		
	}
	
	public int count(int input)
	{
		if (input == 0)
			return 0;
		
		  int temp1 = input % 10 ;
		  int temp2 = count(input / 10);
			
		  return temp1+temp2;
		  
		//return (input % 10) + count(input / 10);
	}
}
