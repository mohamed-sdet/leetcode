package recurssion;

import org.junit.Test;

public class ReverseString {
	
	@Test
	public void exampleData()
	{
		String s = "hello";
		
		System.out.println(reverse(s));
	}

	
	String out="";
	
	public String  reverse(String s)
	{
		if(s.length()==0)
			return "";
		
		out = out  + s.charAt(s.length()-1);
		
		reverse(s.substring(0,s.length()-1));
		
		return out;
		
	}
	

}
