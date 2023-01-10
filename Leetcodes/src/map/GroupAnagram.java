package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class GroupAnagram {

	@Test
    public void examplePostivedata()
    {
    	String[] s = {"eat","tea","tan","ate","nat","bat"};
    	
    	groupAnagramByMap(s);
    }

	private void groupAnagram(String[] s) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<s.length;i++)
		{
			char[] ch = s[i].toCharArray();
			
			HashMap<Character,Integer> map = new HashMap<>();
			
			for(int j=0;j<ch.length;j++)
			{
				map.put(ch[j], map.getOrDefault(ch[i], 0)+1);
			}
			
			for(int k=i+1;k<s.length;k++)
			{
				char[] ch2 = s[k].toCharArray();
				HashMap<Character,Integer> map2 = new HashMap<>();
				
				
			}
		}
	}
	
	public ArrayList<List<String>>  groupAnagramByMap(String[] s)
	{
		
		HashMap<HashMap<Character,Integer>,List<String>> map = new HashMap<>();
		
		for(int i=0;i<s.length;i++)
		{
			char [] ch= s[i].toCharArray();
			
			HashMap<Character,Integer> tempMap = new HashMap<>();
			
			for(int j=0;j<ch.length;j++)
			{
				tempMap.put(ch[j],tempMap.getOrDefault(ch[j], 0)+1);
			}
			
			if(map.containsKey(tempMap))
			{
				List<String> list2 =  map.get(tempMap);
			    list2.add(s[i]);
			    map.put(tempMap, list2);
				
			}else
			{
				List<String> list = new ArrayList<>();
				list.add(s[i]);
				map.put(tempMap, list);
				//e-1,a-1,t-1 ,eat
			}
			
			return new ArrayList<>(map.values());
			
			
		}
		
	}
	
}
