package map;

import java.util.HashMap;

import org.junit.Test;

public class PermutationinString {

	@Test
	public void examplePositiveData()
	{
		String s2 ="aaabb";
		
		String s1= "ab";
		
		PermutationinString(s,s1);
		
	}

	private boolean PermutationinString(String s2, String s1) {
		// TODO Auto-generated method stub
		
		HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
		HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
		

		  
		  for(int i=0;i<s1.length();i++)
		  {
			  map2.put(s1.charAt(i), map2.getOrDefault(s1.charAt(i), 0)+1);
		  }
		  
		  for(int i=0;i<s2.length();i++)
		  {
			  map1.put(s2.charAt(i), map1.getOrDefault(s2.charAt(i), 0)+1);
			  
			  if(i>=s1.length())
			  {
				  char ch = s2.charAt(i);
				  
				  if(map1.get(ch)==1)
				  {
					  
					  map1.remove(ch);
				  }else
				  {
					  map1.put(ch, map1.get(ch)-1);
				  }
				  if(map2.equals(map1))
				  {
					  return true;
					 
				  }
			  }
			  
		  }
		  
		  return false;

	}
	
	
	
}
