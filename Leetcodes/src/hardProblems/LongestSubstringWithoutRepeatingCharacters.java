package hardProblems;

import java.util.HashSet;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharacters {
	
	@Test
	public void exampleData()
	{
		
		String s = "abcabcbb";
		
		longestSubstringWithoutRepeatingCharacters(s);
		
	}

	private void longestSubstringWithoutRepeatingCharacters(String s) {
		// TODO Auto-generated method stub
		int left=0,right=0,maxLen=0;
		
		HashSet<Character> set = new HashSet<>();
		while(right<s.length())
		{
			if(set.add(s.charAt(right++)))
			{
				maxLen= Math.max(maxLen, set.size());
			}else
			{
				left++;
				right=left;
				set.clear();
			}
		}
		System.out.print(maxLen);	
		
	}

}
