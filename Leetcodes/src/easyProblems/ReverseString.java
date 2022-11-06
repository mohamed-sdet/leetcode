package easyProblems;

import org.junit.Test;

public class ReverseString {

	
	//https://leetcode.com/problems/reverse-string/
	
	@Test
	public void examplePositiveData()
	{
	 char[]	s = {'h','e','l','l','o'};
	 
	 ReverseString(s);
		
	}

	private void ReverseString(char[] s) {
		// TODO Auto-generated method stub
		
		 int count =0;
		
			 for(int j=s.length-1;j>=0;j--)
			 {
				 char temp;
				 temp=s[count];
				 s[count++]= s[j];
				 s[j]=temp;

			 }
			

		
		System.out.print(s);
	}
}
