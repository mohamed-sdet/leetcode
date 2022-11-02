package map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class FindCommonCharacters {
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	@Test
	public void examplePosiiveData()
	{
		String[] words = {"bella","label","roller"};
		
		findCommonCharactersBruteForce(words);
	}
	
	@Test
	public void exampleEdgeData()
	{
		String[] words = {"cool","lock","cook"};
		
		findCommonCharactersBruteForce(words);
	}

	private void findCommonCharactersBruteForce(String[] words) {
		
		  int wLength = words.length; 
		  HashMap<Character,Integer> sMap = new HashMap<>();
		 
		  for(int i=0;i<words[0].length();i++)
			  {
			  sMap.put(words[0].charAt(i), sMap.getOrDefault(words[0].charAt(i), 0)+1);  
			  }

		  for(int i=1;i<words.length;i++)
		  { 
			 HashMap<Character,Integer> tMap = new HashMap<>();
			 String ch = words[i];
			 for(int j=0;j<ch.length();j++)
			 { 
				 if(sMap.containsKey(ch.charAt(j)))
				  {		int cnt = sMap.get(ch.charAt(j));
					 	tMap.put(ch.charAt(j), Math.min(cnt,tMap.getOrDefault(ch.charAt(j),0)+1));  
				 }
			 }
			 sMap=tMap;
		  }
		  System.out.println(sMap);	
		  
	}
}
