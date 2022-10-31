package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class IsomorphicStrings {

	
	
	
	/*Get the length of string s and t 
	 *Create map for string s
	 *Create another map for string t
	 *Iterate given input s string value and store the occurrence in first map  
	 *Iterate given input t value and store the occurrence in second map 
	 *Now compare first and second map values if both order and occurrence are same return as true
	 * 
	 */
	
	
	@Test
	public void examplePositiveData()
	{
		String s = "egge";
		String t ="addl";
		
	
		Assert.assertEquals(IsomorphicStrings(s,t),true);
		
		
	}

	private boolean IsomorphicStrings(String s, String t) {
		// TODO Auto-generated method stub
		
		
		int sLength= s.length();
		int tlength =t.length();
		boolean output= false;
		if(sLength!=tlength) return false;
		HashMap<Character,Character> sMap= new HashMap<>();
		HashMap<Character,Character> tMap= new HashMap<>();
		for(int i=0;i<sLength;i++)
		{
			char a= s.charAt(i);
			char b =t.charAt(i);
			
			if(sMap.containsKey(b) && sMap.get(a)!=b)
			{
				return false;
			}
			
			if(tMap.containsKey(a) && tMap.get(b)!=a)
			{
				return false;
			}
			
			sMap.put(a, b);
			tMap.put(b, a);
			
			
			
			
			
			//sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i), 0)+1);
			//tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i), 0)+1);
		}
		
		//Set<Integer> hash_Set1 = new HashSet<Integer>();
		//Set<Integer> hash_Set2 = new HashSet<Integer>();
		
		//for(int j=0;j<sMap.size();j++)
		//{
		//	hash_Set1.add(sMap.get(s.charAt(j)));
		//	hash_Set2.add(tMap.get(t.charAt(j)));
		//}
		
	   // if(hash_Set1.equals(hash_Set2)) output= true; 
		
		return true;
	}
	
	
}
