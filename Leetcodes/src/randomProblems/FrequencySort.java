package randomProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.Test;

public class FrequencySort {

	/*
	Given comma seperated words you have to sort words based on frequency in descending ordeer,if word frequency are same then sort based on alphabet in ascending order.
	String input = "Mango,Orange,Mango,Apple,Orange,Mango"
	Output : Mango : 3, Orange :2, Apple :1 */
	
	@Test
	public void exampleData()
	{
		String[] input = {"Mango","Orange","Mango","Apple","Orange","Mango"};
		
		frequencySort(input);
		
	}

	private void frequencySort(String[] input) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> map = new TreeMap<>();
		
		
		for(String s : input)
		{
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		
		List<Integer> list = new ArrayList<>();	
		
		for(Entry<String, Integer> s: map.entrySet())
		{
			list.add(s.getValue());
		}
		
		Collections.sort(list);
	
		
		for(int i=list.size()-1;i>=0;i--)
		{
			for(Entry<String, Integer> s: map.entrySet())
			{
				if(s.getValue() == list.get(i))
				{
					System.out.print(s.getKey()+" "+s.getValue());
				}
			}
		}
		

		
		//System.out.print(map);
	}
	
}
