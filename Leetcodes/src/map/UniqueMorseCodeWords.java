package map;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

public class UniqueMorseCodeWords {

	
	@Test
	public void examplePositiveData()
	{
		String[] words = {"gin","zen","gig","msg"};
		uniqueMorseCodeWords(words);
		
	}

	private int uniqueMorseCodeWords(String[] words) {
		// TODO Auto-generated method stub
		String [] morseCode= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	
		HashSet<String> smap =new HashSet();
			String concadinate="";
		
		for( int i=0;i<words.length;i++)
		{
		
			char[] arr = words[i].toCharArray();
			for(int j=0;j<arr.length;j++)
			{
				
				concadinate += morseCode[arr[j]-'a']; 
				
			}smap.add(concadinate);
			concadinate="";
		}
		
		return smap.size();
		
	}
}
