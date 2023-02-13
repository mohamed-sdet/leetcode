package practice;

import org.junit.Test;

public class StringSwap {

	@Test
	public void exampleData()
	{
		String s1="good";
		String s2="day";
		
		swapString(s1,s2);
		
		
	}
	@Test
	public void exampleData1()
	{
		String s1="day";
		String s2="good";
		
		swapString(s1,s2);
		
		
	}
	private void swapString(String s1, String s2) {
		// TODO Auto-generated method stub
		s1 = s1+s2;
		
		s2 = s1.substring(0,s1.length()-s2.length());
		
		s1= s1.substring(s2.length());
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
