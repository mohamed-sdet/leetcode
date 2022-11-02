package map;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

public class SubstringsofSizeThreewithDistinctCharacters {

	
	
	
	/* Hashing with sliding window approach
	 * Initialize map one with length of k value 
	 * Initialize map with length of string length 
	 * Iterate second map with first map with sliding window technique 
	 * Remove 0th index value and add another value in the map 
	 * while removing and adding value check contains of string value 
	 */
	
	@Test
	public void examplePositiveData()
	{
		
		String  s = "aababcabc";
		int k=3;
		substringsofSizeThreewithDistinctCharacters1(s,k);
		
	}

	private void substringsofSizeThreewithDistinctCharacters(String s, int k) {
		// TODO Auto-generated method stub
		
		HashMap<Character,Integer> sMap = new HashMap<Character,Integer>();
		HashMap<Character,Integer> tMap = new HashMap<Character,Integer>();
		
		int count=0;
		
		for(int i=0;i<s.length();i++)
	     	{
			for(int j=i;j<k+j;j++)
			{
				sMap.put(s.charAt(j),sMap.getOrDefault(s.charAt(j), 0)+1);
				
				
			}k++;
			sMap.clear();
		

		}

		System.out.print(sMap);
 		
	}
	
	private void substringsofSizeThreewithDistinctCharacters1(String s,int k)
	{
		
		HashSet<Character> sMap = new HashSet();

		int output=0;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<k+i;j++)
			{
			sMap.add(s.charAt(j));
			}
			
			if(sMap.size()==k)
			{
				output++;
				System.out.print(sMap);
			}
			
			
			sMap.clear();
		}
		
	}
	
	
	
	
	
}
