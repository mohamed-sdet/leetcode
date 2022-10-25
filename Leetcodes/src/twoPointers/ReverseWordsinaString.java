package twoPointers;

import java.util.Arrays;

import org.junit.Test;

public class ReverseWordsinaString {
	
	/* Reverse only word from the given sentence 
	 * loop thought the given array split sentence by a word 
	 * now reverse the word and return 
	 */
	
	@Test
	public void examplePositiv()
	{
		String s ="Let's take LeetCode contest";
		
		reverseOnlyWord(s);
	
	}

	private void reverseOnlyWord(String s) {
		// TODO Auto-generated method stub
		
		String[] ch = s.split("\\s");
		String word;
	    String  output = " ";
		
	
		for(int i=0;i<ch.length;i++)
		{
			word = ch[i];
	
			
			char[] tempWord = word.toCharArray();
			int start =0;
			int end=tempWord.length-1;
			while(start<end)
			{
				char temp = tempWord[end];
				tempWord[end] = tempWord[start];
				tempWord[start]= temp;
				start++;
				end--;
					
			}
			String str = String.copyValueOf(tempWord);
			output = output +" " + str;
		
		}
		
		System.out.print(output);
	}

}
