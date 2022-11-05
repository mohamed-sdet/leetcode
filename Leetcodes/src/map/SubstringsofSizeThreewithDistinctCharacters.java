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
	{  String  s = "aababcabc";
		int k=3;
		substringofSizeThreewithDistinctCharactersslidingwindow(s,k);}

	private void substringofSizeThreewithDistinctCharactersslidingwindow(String s ,int k)
	{ 
		
		int windowSize=k;
		
		int count=0;
		int start =0;
		int right =0;
		int window=3;
		
		HashSet <Character> hashset = new HashSet();
		HashSet <Character> hashset2 = new HashSet();
		while(right<s.length())
		{
			if(!hashset.add(s.charAt(right)))
			{
				if(hashset.size()==window)
				{
					System.out.print(hashset);
				}
	
			}else
			{
				
			}hashset.remove(++start);
			
			right++;

		}
			
		System.out.print(count);
				
	
}
}
