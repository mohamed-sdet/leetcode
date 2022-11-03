package map;

import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class JewelsandStones {

	
	@Test
	public void exampleData()
	{
		
		String jewels = "aA", stones = "aAAbbbb";
		jewelsandStones(jewels,stones);
		
	}
	@Test
	public void exampleDataEdge()
	{
		
		String jewels = "z", stones = "ZZ";
		jewelsandStones(jewels,stones);
		
	}

	private void jewelsandStones(String jewels, String stones) {
		// TODO Auto-generated method stub
		
		int jLenth = jewels.length(), sLength = stones.length();
		int output=0;
		
		HashMap<Character,Integer> smap= new HashMap();
		HashMap<Character,Integer> tmap= new HashMap();
		
		for(int i=0;i<jLenth;i++)
		{
			smap.put(stones.charAt(i), smap.getOrDefault(stones.charAt(i), 0)+1);
		}
		for(int j=0;j<sLength;j++)
		{
			
			tmap.put(stones.charAt(j), tmap.getOrDefault(stones.charAt(j), 0)+1);
		
			if(smap.containsKey(stones.charAt(j)))
			{
				output+= smap.get(stones.charAt(j));
			}
		}
		
		System.out.println(smap);
		System.out.println(tmap);
		
		System.out.print(output);
	}
}
