package twoPointers;

import org.junit.Test;

public class Palindrome { 

	@Test
	public void examplePositive()
	{
		
		String s = "MOM";
		
		isPalindrome(s);
		
	}

	private void isPalindrome(String s) {
		// TODO Auto-generated method stub
		
		int p1=0;
		
		char[] ch = s.toCharArray();
		int p2=ch.length-1;
		char temp;
		
		while(p1<p2)
		{
			temp = ch[p2];
			ch[p2]=ch[p1];
			ch[p1]=ch[p2];
			p1++;
			p2--;
			
		}
		
		System.out.print(ch);
		
		if(ch.toString() == s)
		{
			
			System.out.print("Given is Palindrome ");
		}
		else
		{
			
			System.out.print("Given is not  Palindrome ");
		}
			
		
	}
	
}
