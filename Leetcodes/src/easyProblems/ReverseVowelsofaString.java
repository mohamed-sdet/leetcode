package easyProblems;

import org.junit.Test;

public class ReverseVowelsofaString {
	
	
	private static final String String = null;

	//https://leetcode.com/problems/reverse-vowels-of-a-string/
	
	
	
	/*Initialize two pointer 
	 * a) start as 0
	 * b) end as s length -1
	 * Initialize while condition check foe start value and end value 
	 * If start and end are value are vowels 
	 * if both is vowels swap it 
	 * then return the string
	 */
	
	
	@Test
	public void postiveData()
	{
		
		String s = "hello"; 
		RrverseVowelsofaString( s);
	}
	
	@Test
	public void edgeData()
	{
		
		String s = "helloHELLO"; 
		RrverseVowelsofaString( s);
	}
	
	@Test
	public void negativeData()
	{
		
		String s = "Eo"; 
		RrverseVowelsofaString( s);
	}

	private void RrverseVowelsofaString( String s) {
		// TODO Auto-generated method stub
	
		char [] ch = s.toCharArray();
		int start =0, end=ch.length-1;
		
		while(start<end)
		{

			
			if(isVowels(ch[start]) && isVowels(ch[end]))
			{
				char temp;
				
				temp = ch[end];
				ch[end--] = ch[start];
				ch[start++]=temp;
				
			}else if(isVowels(ch[start])) 
				{
				end--;
				}
			else  
				{
				start++;
				}
			
			
			
		}
		
		System.out.println(String.copyValueOf(ch));
		
		
		
	}
	
	public boolean isVowels(char c)
	{
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )  return true;
		
		return false;
	}
	

}
