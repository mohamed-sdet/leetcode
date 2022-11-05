package map;
import java.util.HashMap;

import org.junit.Test;

public class Anagram {
	
	
	@Test
	public void examplePositiveData()
	{
		String s = "cbaebabacd";
		String k = "abc";
		
		anagram(s,k);
		
	}

	private void anagram(String s, String k) {
		// TODO Auto-generated method stub
		
		int sLength = s.length();
		int kLength= k.length();
		
		HashMap <Character,Integer> map = new HashMap<>();
		HashMap<Character,Integer> kmap = new HashMap<>();
		
		for(int i=0;i<kLength;i++)
		{
			map.put(k.charAt(i),map.getOrDefault(k.charAt(i), 0)+1);
			
		}
		for(int j=0;j<sLength;j++)
		{
			kmap.put(s.charAt(j),kmap.getOrDefault(s.charAt(j), 0)+1);
			
			if(j>=kLength)
			{
				char ch = s.charAt(j-kLength);
				
				if(kmap.get(ch)==1)
				{
					kmap.remove(ch);
				}else
				{
					kmap.put(ch, kmap.get(ch)- 1);
				}
				
			}
			
			if(map.equals(kmap))
			{
				
				System.out.println("matches");
			}
			
			
		}

		
	}

}
