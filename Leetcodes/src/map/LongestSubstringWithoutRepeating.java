package map;

import java.util.HashSet;

import org.junit.Test;

public class LongestSubstringWithoutRepeating {

	@Test
	public void examplePositiveData()
	{
		String s = "abcabcbb";
		longestSubstringWithoutRepeatingHashSet(s);
	}
	
	@Test
	public void exampleEdgeData()
	{
		String s = "pwwkew";
		longestSubstringWithoutRepeatingHashSet(s);
	}
	
	@Test
	public void exampleNegativeData()
	{
		String s = "bbbbb";
		longestSubstringWithoutRepeatingHashSet(s);
	}
	
	public void longestSubstringWithoutRepeatingHashSet(String s)
	{
		int right =0 ,left=0,max=0;
		HashSet<Character> set = new HashSet<Character>();
		
		while(right<s.length())
		{
			if(set.add(s.charAt(right++)))
				max= Math.max(max, set.size());	
			else
			{
				right=left++;
				set.clear();
			}
		}
		
		System.out.print(max);
		
		
	}
	
}
