package map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

import org.junit.Test;

public class DistintAndUnque {
	
	@Test
	public void PositiveData()
	{
		
		String input = "automation";
		
		findDistintCharacter(input);
		
	}

	private void findDistintCharacter(String input) {
		// TODO Auto-generated method stub
		
		HashMap<Character,Integer> map = new HashMap<>();
		
	    for(int i=0;i<input.length();i++)
	    {
	    	
	    	map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0)+1);
	    }
	    
	    for(Entry<Character, Integer> ch : map.entrySet())
	    {
	    	int temp = ch.getValue();
	    	
	    	if(temp==2)
	    	{
	    		System.out.println("duplicate " + ch.getKey());
	    		
	    	}else
	    	{
	    		
	    		System.out.println("unique " + ch.getKey());
	    	}
	    }
		
		
	}
	
	private void findDistintCharacterOtimized(String input) 
	{
		
	
	}
	
	
	

}
