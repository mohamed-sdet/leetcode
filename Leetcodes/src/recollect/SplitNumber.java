package recollect;

import org.junit.Test;

public class SplitNumber {
	
	
	@Test
	public void exampleData()
	{
		
		int nums = 9991;
		//int nums = 111;
		
		sumInSingleDigit(nums);
		
	}

	private int  findsum(int nums) {
		// TODO Auto-generated method stub
		
		int sum=0;
		
		while(nums>0)
		{
			sum = sum + nums%10;
			nums= nums/10;
			
		}
		//System.out.print(sum);
		return sum;
	}
	
	public void sumInSingleDigit(int num){

		int sum = num;
		//9991
	    //28
		//10
		
		while(sum >= 10){
			
			sum = findsum(sum);
		}
		System.out.print(sum);
	}

}
