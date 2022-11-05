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
	{  String  s = "xyzzaz";
		int k=3;
		substringofSizeThreewithDistinctCharactersslidingwindow(s,k);}

	private void substringofSizeThreewithDistinctCharactersslidingwindow(String s ,int k)
	{ 
		
		int count=0;
		int right =0;
		
		HashSet <Character> hashset = new HashSet<Character>();
		while(right<s.length())
		{
			hashset.add(s.charAt(right));
			
			if(right>=k)
			{
				char ch = s.charAt(right-k);
				if(!hashset.contains(ch))
				hashset.remove(ch);
				
			}if(hashset.size()==k)
			{
				count++;
			}
			right++;

		}
			
		System.out.print(count);
}
}
