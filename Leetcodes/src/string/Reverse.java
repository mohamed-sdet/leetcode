package string;

import java.util.Arrays;

import org.junit.Test;

public class Reverse {
	
	@Test
	public void exampleData()
	{
		String s ="hello";
		
		exampleData(s);
	}

	private void reverseCharAt(String s) {
		// TODO Auto-generated method stub
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}
	
	private void reverseTwoPointer(String s )
	{
	   
		char [] ch = s.toCharArray();
		int left =0;
		int right =ch.length-1;
		
		while(left<right)
		{
			char temp = ch[right];
			ch[right--] = ch[left];
			ch[left++] = temp;
		}
		
		System.out.print(Arrays.toString(ch));
		System.out.print(String.copyValueOf(ch));
	}

	public void exampleData(String s)
	{
		char [] ch = s.toCharArray();
		
		int left =0;
		int right = ch.length-1;
		
		while(left<right)
		{
			char temp = ch[right];
			ch[right--] = ch[left];
			ch[left++] = temp;
			
		}
			
		System.out.print(String.copyValueOf(ch));
	}
}
