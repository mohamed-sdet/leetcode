package easyProblems;

import org.junit.Test;

public class ReverseString {

	
	//https://leetcode.com/problems/reverse-string/
	
	@Test
	public void examplePositiveData()
	{
	 char[]	s = {'h','e','l','l','o'};
	 
	 ReverseStringTwoPointer(s);
		
	}

	private void ReverseString(char[] s) {
		// TODO Auto-generated method stub
		
		 int count =0;
		
			 for(int j=s.length-1;j>=0;j--)
			 {

				 System.out.println(s[j]);
			 }
			
	}
	
	private void ReverseStringTwoPointer(char[] s)
	{
		
		int start =0,end=s.length-1;
		while(start<end)
		{
			char temp;
			temp=s[end];
			s[end--]=s[start];
			s[start++]=temp;
		}
		System.out.print(s);
	}
}
