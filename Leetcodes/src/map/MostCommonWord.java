package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class MostCommonWord {
	
	
	/*
	 * Split input string by , and . then split by space
	 * Store then spited string in char array 
	 * Now create one Map then store the occurrence 
	 * Now get the map value based on banned value
	 * 
	 * 
	 * 
	 */

	@Test
	public void examplePositiveData()
	{
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit";
		String	banned = "hit";
		
		mostCommonWord(paragraph,banned);
		
	}

	private String mostCommonWord(String paragraph, String banned) {
		// TODO Auto-generated method stub
		String output = "" ;
		String [] wordDot =paragraph.toLowerCase().replaceAll("[!?',;.]", "").trim().split("\\s+");
		
		HashMap<String,Integer> sMap= new HashMap<>();
		
		for(int i=0;i<wordDot.length;i++) 
			{
			if(!wordDot[i].equals(banned))sMap.put(wordDot[i], sMap.getOrDefault(wordDot[i], 0)+1);			
			}
		int max = Collections.max(sMap.values());
		System.out.println(sMap);
		
		for(Entry<String, Integer> entryset: sMap.entrySet())
		{
			if(entryset.getValue()==max)
			{
				output= entryset.getKey();

			}
		}
		System.out.print(output);
		return output;
	}
	
}
