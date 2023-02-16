package practice;

import java.util.Arrays;

import org.junit.Test;

public class ReversePrefixofWord {
	
	
	@Test
	public void exampleData()
	{
		String word = "abcdefd";
		String ch = "d";
		
		reverseuntillch(word,ch);
	}

	private void reverseuntillch(String word, String ch) {
		// TODO Auto-generated method stub
		
		char [] wch = word.toCharArray();
		int left =0;
		int right = word.indexOf(ch);
		
		while(left<right)
		{
			char temp = wch[right];
			wch[right--] = wch[left];
			wch[left++] = temp;
			
		}
		
		System.out.print(Arrays.toString(wch));
	}
	
	
}
