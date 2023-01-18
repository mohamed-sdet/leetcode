package recollect;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class FindDuplicateCharacter {
	
	@Test
	public void examplePostiveData()
	{
		String s = "this is my test string";
		
		findtheduplicate(s);
		
	}

	private void findtheduplicate(String s) {
		// TODO Auto-generated method stub

		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		for(Map.Entry<Character,Integer> i : map.entrySet())
		{
			if(i.getValue()==1)
			{
				System.out.println(i.getKey());
			}
		}
		
		
	}

}
