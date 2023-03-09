package problems;

import java.util.HashSet;

import org.junit.Test;

public class LongestSubString {
	
	@Test
	public void exampleData()
	{
		String s = "abcabcabb";
		
		longestSubString(s);
	}

	private void longestSubString(String s) {
		// TODO Auto-generated method stub
		
		char [] ch = s.toCharArray();
		HashSet<Character> set = new HashSet<>();
		int max = 0;
		int left =0;
		for(int i=0;i<ch.length;i++)
		{
			if(set.add(ch[i]))
			{
				max = Math.max(max, set.size());
				
			}else
			{
				i = ++left;
				set.clear();
			}
		}
		System.out.print(max);
	}

}
