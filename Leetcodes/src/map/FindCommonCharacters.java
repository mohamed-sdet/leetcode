package map;

import java.util.HashMap;

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

	private void findCommonCharactersBruteForce(String[] words) {
		// TODO Auto-generated method stub

		  int wLength = words.length;
		  
		 HashMap<Character,Integer> sMap = new HashMap<>();
		 
		 for(int i=0;i<wLength;i++)
		 {
			 String ch= words[i];
			 
			 
			 for(int j=0;j<ch.length();j++)
			 {
				// if(!sMap.containsKey(ch.charAt(j)))
				 sMap.put(ch.charAt(j), sMap.getOrDefault(ch.charAt(j), 0)+1); 
			 }
 
		 }
		 
		 System.out.print(sMap);
		
	}
	

}
