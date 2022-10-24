package twoPointers;

import org.junit.Test;

public class ReversePrefixofWord {

	
	/*2000. Reverse Prefix of Word
	 * Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
	   For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
       Return the resulting string.
	 */
	
	
	/* Two Pointer Algo
	 * Start with index =0
	 * End index find the index of ch 
	 * Swap between index 0 to ch index 
	 * return the swap index 
	 */
	
	@Test
	public void examplePositive()
	{
		
		String s= "abcdefd";
		char ch = 'd';
		
		reversePrefix(s,ch);
		
	}

	private void reversePrefix(String s, char ch) {
		// TODO Auto-generated method stub
		
		char [] input = s.toCharArray();
		int start=0;
		int end = 0;
		char temp ;
		char [] output = new char[s.length()];
		
		for(int i =0; i<input.length;i++)
		{
			if(input[i] == ch )
			{
				end = i;
				break;
				
			}
		}
		while(start<end)
		{
			temp  = input[end]; 
			input[end--]= input[start];
			input[start++]= temp;
		}
		System.out.print(input);
	}
	
	
	
	
	
}
