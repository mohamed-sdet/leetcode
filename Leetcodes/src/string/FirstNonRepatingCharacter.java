package string;

import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class FirstNonRepatingCharacter {
	
	//Java Program To Find First Non Repeated Character 
	
	@Test
	public void exampleData()
	{
		String s = "abcdacdcz";
		
		char [] ch = s.toCharArray();
		
		
		for(int i=0;i<ch.length;i++)
		{
			boolean re = true;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					re = false;
					break;
				}
			}
			
			if(re)
			{
				System.out.print(ch[i]);
				break;
			}
		}
		
	}

	
	@Test
	public void nonRepeatingMethod2()
	{
		String s = "abcdacdcz";
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		for(Entry<Character,Integer> entrySet : map.entrySet())
		{
			if(entrySet.getValue() ==1)
			{
				System.out.print(entrySet.getKey());
				break;
			}
		}
			
	
	}
}
