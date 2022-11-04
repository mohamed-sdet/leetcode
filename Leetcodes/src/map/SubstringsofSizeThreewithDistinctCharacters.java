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
		substringofSizeThreewithDistinctCharactersslidingwindow(s,k);
		
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
		int start=0;
		int count=0;
		
		HashSet<Character> set = new HashSet<>();
		
		for(int i=0;i<k;i++)
		{
			set.add(s.charAt(i));
		
			if(set.size()==k)
			{
				count++;
			}
			
			for(int j=k-1;j<s.length();j++)
			{ 
				
				
				set.remove(s.charAt(start));
				set.add(s.charAt(j));
				

				if(set.size()==k)
				{
					count++;
				}
				
				start++;
			}
		}
		
		
		System.out.print(count);
		//System.out.print(set);
		
		
		
		
	}
	
	private void substringofSizeThreewithDistinctCharactersslidingwindow(String s ,int k)
	{ 
		
		int windowSize=k;
		
		int count=0;
		int start =0;
		int right =0;
		
		HashSet <Character> hashset = new HashSet();
		
		while(right<s.length())
		{
			if(hashset.add(s.charAt(right++)))
			{
				if(hashset.size()==3)
				{
					count++;
				}
			}else
			{
				right=++start;
				hashset.clear();
			}
			
		}
		System.out.print(count);
		
		
	}
	
	
	
}
