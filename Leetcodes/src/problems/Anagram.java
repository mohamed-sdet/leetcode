package problems;

import java.util.HashMap;

import org.junit.Test;

public class Anagram {
	
	@Test
	public void postiveData()
	{
		
		String s = "cbaebabacd";
		String p = "abc";
		
		findAnagramcount(s,p);
				
	}

	private void findAnagramcount(String s, String p) {
		// TODO Auto-generated method stub
		char [] sh= s.toCharArray();
		char [] pch = p.toCharArray();
		
		int counter =0;
		
		HashMap<Character,Integer> smap = new HashMap<>();
		HashMap<Character,Integer> pmap = new HashMap<>();
		
		for(char a : pch)
		{
			pmap.put(a, pmap.getOrDefault(a, 0)+1);
		}
		
		for(int i=0;i<sh.length;i++)
		{
			
			smap.put(sh[i], smap.getOrDefault(sh[i], 0)+1);
			
			if(i>=pch.length)
			{
				if(smap.get(sh[i-pch.length]) ==1)
				{
					smap.remove(sh[i-pch.length]);
				}else
				{
					smap.put(sh[i-pch.length], smap.getOrDefault(sh[i-pch.length], 0)-1);
				}
					
			}
			
			if(smap.equals(pmap))
			{
				System.out.println("matches");
			}
			
			
		}
		
		
	}

}
