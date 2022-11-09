package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class UncommonWordsfromSentences {
	
	//https://leetcode.com/problems/uncommon-words-from-two-sentences/
	
	
	/*Create map1 for given input string s1
	 *Create map2 for given input string s2
	 * Iterate s1 by spit it by space and add it to map1 key as words and values as occurrence 
	 * Iterate s2 by spit it and add it to map2 key as words and values as occurrence 
	 * Compare map1 keys with map2 return unmatched words in arrays [0] and array [1]
	 * 
	 */

	@Test
	public void examplePositiveData()
	{
		
		String s1 = "this apple is sweet", s2 = "this apple is sour";
		
		uncommonWordsfromSentences(s1,s2);
		
	}

	private void uncommonWordsfromSentences(String s1, String s2) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map = new HashMap<>();
		
		ArrayList<String> outputArray = new ArrayList<>();
		
		String [] splits1 = s1.split(" ");
		String [] splits2 = s2.split(" ");
		
		for(int i=0;i<splits1.length;i++)
		{
			map.put(splits1[i], map.getOrDefault(splits1[i],0)+1);
		}
		
		for(int i=0;i<splits2.length;i++)
		{
			map.put(splits2[i], map.getOrDefault(splits2[i],0)+1);
		}
		
		for(Entry<String, Integer> eachEntry: map.entrySet())
		{
			if(eachEntry.getValue()==1)
			{
				outputArray.add(eachEntry.getKey());
			}
		}
		
		String [] out = new String [outputArray.size()];
		

		for(int i=0;i<outputArray.size();i++)
		{
			out[i] =outputArray.get(i);
			System.out.println(out[i]);
		}
		
		

	}
}
