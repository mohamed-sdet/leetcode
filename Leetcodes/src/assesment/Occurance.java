package assesment;

import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class Occurance {
	
	@Test
	public void positiveData()
	{
		 String s = "aaabbccaad";
       // String out = "a3b2c2a2d1";
		
		occurance(s);
	}

	private void occurance(String s) {
		// TODO Auto-generated method stub
		
		HashMap<Character,Integer> ch = new HashMap<>();
		
		String output =null;
		
		for(int i=0;i<s.length();i++)
		{
			
			ch.put(s.charAt(i), ch.getOrDefault(s.charAt(i), 0)+1);
		}
		
		for(Entry<Character, Integer>  s1: ch.entrySet())
		{
		   s = s + s1.getKey().toString() + s1.getValue() ;
		}
		
		
		System.out.print(s);
		
	}

}
