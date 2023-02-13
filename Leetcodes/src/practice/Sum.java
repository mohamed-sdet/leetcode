package practice;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Sum {

	@Test
	public void exampleData()
	{
		String s = "123abc526bd";
		sumdigits1(s);
		
	}

	private void sumdigits(String s) {
		// TODO Auto-generated method stub
	    String temp = "0";
		int counter=0;
		int sum = 0;
		for(int i=0;i<s.length();i++)
		{   char ch = s.charAt(i);
			if(Character.isDigit(ch))
			{
				 temp += ch;
			}else
			{
				sum += Integer.parseInt(temp);
				temp="0";
			}
		}
		System.out.print(sum);
	}
	
	private void sumdigits1(String s)
	{
		int sum = 0 ;
		int counter = 0 ;
		String temp1 = null;
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isAlphabetic(s.charAt(i)))
			{
				temp1  += s.substring(i,counter);
			    counter++;
			    System.out.println(temp1);
			}else
			{
				sum += Integer.parseInt(temp1);
				temp1="0";
				counter=0;
			}
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}

