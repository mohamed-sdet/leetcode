package map;

import java.util.HashMap;

import org.junit.Test;

public class FirstUniqueCharacterinaString {
	
	
	
	/*Brute Force
	 * Initialize 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

//	@Test
	public void examplePositiveData()
	{
		
		String s = "leetcode";
		
		FirstUniqueCharacterinaString(s);
		
	}
	
	@Test
	public void examplePositiveData2()
	{
		
		String s = "loveleetcode";
		
		FirstUniqueCharacterinaString(s);
		
	}

	private void FirstUniqueCharacterinaString(String s) {
		// TODO Auto-generated method stub
		
		int output = 0;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=1;j<s.length();j++)
			{
				if(!(s.charAt(i)==s.charAt(j)))
				{
					int temp = i;
					output= Math.min(output, temp);
					break;
				}
			}
			
		}
		System.out.print(output);
		
	}
	
	
	public void FirstUniqueCharacterinaStringMap(String s)
	{
		HashMap<Character,Integer> map = new HashMap<>();
		int output = 0;		
		for(int i=0;i<s.length();i++)
		{
		 map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
		 
		}
		for(int j=0;j<s.length();j++)
		{
			if(map.get(s.charAt(j)) == 1)
			{
				output =j;
				break;
			}
			
		}
		System.out.print(output);
		
	}
}
