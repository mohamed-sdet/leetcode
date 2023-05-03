package randomProblems;

import org.junit.Test;

public class ReverseString {
	
	/*To reverse a string keeping spaces at it's position
	String s="this is a test class"
	o/p: "ssal ct s etas isiht"*/
	
	@Test
	public void exampleData()
	{
		String s="this is a test class";
		
		reverserString1(s);
	}

	private void reverseString(String s) {
		// TODO Auto-generated method stub
		
		String [] sp = s.split(" ");
		String output ="";
		
		for(int i=0;i<sp.length;i++)
		{
			output += " "+reverseStrings(sp[i]);
		}
		
		System.out.print(output);
	}
	
	public String  reverseStrings(String t)
	{
		char [] ch = t.toCharArray();
		
		int left =0;
		int right = ch.length-1;
		while(left<right)
		{
			char temp = ch[right];
			ch[right--] = ch[left];
			ch[left++] = temp;
		}
		return String.copyValueOf(ch); 
	}
	
	public void reverserString1(String s)
	{
	    StringBuilder sb = new StringBuilder();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			sb = sb.append(s.charAt(i));
		}
		
		System.out.print(sb);
	}

}
