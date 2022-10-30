package map;

import java.util.HashMap;

public class LongestNiceSubstring {
	
	
	/*  sliding window with hash
	 * 
	 * Psuedocode 
	 * 
	 * 
	 * Create an hashmap for the given string
	 * Create another hashmap for compare
	 * Now Iterate given input string and store the given string word occurrence count (including caps and small)
	 * then in second hash map iterate each single word with first map and store the occurrence with Sliding window technique remove first and add new 
	 * now Iterate second map with sequence of highest occurrence 
	 * Then store the highest value in string then return as an output
	 */

	
	
	
	public void examplePositiveData()
	{
		String s = "YazaAay";
		
		longestNiceSubstring(s);

	}

	private void longestNiceSubstring(String s) {
		int sLength= s.length();
		
		HashMap<Character,Integer> sMap= new HashMap<>();
		HashMap<Character,Integer> rmap = new HashMap<>();
		
		for(int i=0;i<sLength;i++)
		{	
			sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
			
		}
		
		
		
		
		
	}
	
}
