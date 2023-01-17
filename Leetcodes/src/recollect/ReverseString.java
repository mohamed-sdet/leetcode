package recollect;

import org.junit.Test;

public class ReverseString {
	
	
	@Test
	public void exampleData()
	{
		String s = "Mohamed";
		
		reverseString(s);
	}

	private void reverseString(String s) {
		// TODO Auto-generated method stub
		
		String b = "" ;
		for(int i=s.length()-1;i>=0;i--)
		{
			 b = b + s.charAt(i);
			
		}
		
		System.out.print(b);
	}


   

}
