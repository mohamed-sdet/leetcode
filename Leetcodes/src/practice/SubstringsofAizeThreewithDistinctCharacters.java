package practice;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

public class SubstringsofAizeThreewithDistinctCharacters {

	
	@Test
	public void exampleData()
	{
		String s = "xyzzaz";
		
		countSubstring(s);
	}
	@Test
	public void exampleData1()
	{
		String s = "aababcabc";
		
		countSubstringmap(s);
	}
	private void countSubstring(String s) {
		// TODO Auto-generated method stub
		
			char [] sch = s.toCharArray();
			
			int max =0;
			int count=0;
			HashSet<Character> set = new HashSet<>();
			
			for(int i=0;i<3;i++)
			{
				set.add(sch[i]);
				if(set.size() >=3)
				{
					count++;
				}
			}
			max =count;
			for(int i=3;i<sch.length;i++)
			{
				 set.remove(sch[i-3]);
				 set.add(sch[i]);
				 if(set.size() >=3)
					{
						count++;
					}
			}
			
			System.out.print(max);
			
			
	}

	private void countSubstringmap(String s)
	{
		HashMap<Character,Integer> map = new HashMap<>();
		int count=0;
		int max=0;
		for(int i=0;i<3;i++)
		{
			map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
			if (map.size()==3)
				count++;
		}
		
		for(int i=3;i<s.length();i++)
		{
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
			
			if(map.get(s.charAt(i-3))==1)
			{
				map.remove(s.charAt(i-3));
			}else
			{
				map.put(s.charAt(i-3), map.getOrDefault(s.charAt(i-3), 0)-1);
			}
			
			if(map.size()==3)
				count++;
		}
		
		System.out.print(count);
		
	}
}
