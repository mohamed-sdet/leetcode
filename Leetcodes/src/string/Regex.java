package string;

import org.junit.Test;

public class Regex {

	
	@Test
	public void removeSpecialChracter()
	{
		String s = "j@V@#$%^&*()123";
		
		String replace = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.print(replace);
		
	}
	
	@Test
	public void removeSpace()
	{
		String s = "   j   a   v   a    ";
		 
		String replace = s.replaceAll("\\s", "");
		
		System.out.print(replace);
		
	}
}
