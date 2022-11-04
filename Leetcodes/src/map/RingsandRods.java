package map;

import java.util.HashMap;

import org.junit.Test;

public class RingsandRods {
	
	/*Create map for the given input string
	 * Iterate and put input string in the map 
	 * then check condition if rgb condition have present in same value 
	 *  if present increase counter
	 */
	@Test
	public void examplePositiveData()
	{
		String  rings ="B0B6G0R6R0R6G9";
		
		ringsandRods(rings);
	}

	private void ringsandRods(String rings) {
		// TODO Auto-generated method stub
		
		int output=0;
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		
	for(int i=0;i<rings.length();i++)
	{
		
		if(i%2==0)
		{int temp =i+1;
		map.put(rings.charAt(i), rings.charAt(temp));
		}
	}
	System.out.println(map);
	}
	
	
	

}
