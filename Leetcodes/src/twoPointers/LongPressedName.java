package twoPointers;

import org.junit.Test;

public class LongPressedName {
	
	
	//set start pointer for start and end 0
	// compare start and end values 
	/* if it match increment right then return true 
	 * 
	 */

	
	
	public void examplePositive()
	{
		
		String name = "alex";
		String typed = "aaleex";
		
		isLongPressedName(name,typed);
		
		
	}
	
	@Test
	public void edgeTestCases()
	{
		
		String name = "saeed";
		String typed = "ssaaedd";
		isLongPressedName(name,typed);
	}

	private boolean isLongPressedName(String name, String typed) {
		// TODO Auto-generated method stub
		boolean result =false;
		int start =0;int end=0;
		while (start<name.length() && end<typed.length())
		{
			if(name.charAt(start) == typed.charAt(end))
			{
				result = true;
				end++;
				
			}else start++;
			
		}
		
		System.out.print(result);
		return result;
		
	}
	
	
	
	
}
