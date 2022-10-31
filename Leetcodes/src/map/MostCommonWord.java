package map;

import java.util.HashMap;

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

	private void mostCommonWord(String paragraph, String banned) {
		// TODO Auto-generated method stub
		
		
		
		String sentance = paragraph.replaceAll(",", "");
		
		String sentanceLower = sentance.toLowerCase();
		String [] wordDot =sentanceLower.split(" ");
		
		HashMap<String,Integer> sMap= new HashMap<>();
		HashMap<String,Integer> tMap= new HashMap<>();
		
		tMap.put(banned, 1);
		
		for(int i=0;i<wordDot.length;i++) 
			{
			 if(tMap.get(banned) != null)
			sMap.put(wordDot[i], sMap.getOrDefault(wordDot[i], 0)+1);
			
			}

		
		
		System.out.println(sMap);
		System.out.println(tMap);
		
		
		
	}
	
}
