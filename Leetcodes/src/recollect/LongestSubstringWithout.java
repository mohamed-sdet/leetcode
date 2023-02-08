package recollect;

import java.util.HashSet;

import org.junit.Test;

public class LongestSubstringWithout {
	
	@Test
	public void postiveData1()
	{
		String s = "abcabcbb";
		longestSubstring(s);
	}
	
	@Test
	public void edgeData1()
	{
		String s = "aaaa";
		longestSubstring(s);
	}
	@Test
	public void negativeData1()
	{
		String s = "";
		longestSubstring(s);
	}
	
	//Space Complexity => o(1)
	//Time Complexity => o(n)
	
	//Solve this using slow and fastPointer 
	/*
	 * Initialize HashSet,left and right pointer
	 * Iterate  give string and add it to set , if set return false
	 * Increment left and assign right to left and clear set value
	 */

	private int longestSubstring(String s) {
		
		int output=0;
		int left=0;
		HashSet<Character> set = new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			if(set.add(s.charAt(i)))
			{
				set.add(s.charAt(i));
			}else
			{
				output=Math.max(output, set.size());
				left++;
				i=left;
				set.clear();
				
			}
		}
		
		System.out.print(output);
		return output;
	}

}
