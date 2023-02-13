package map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Anagram {
	
	
	
	/*Sliding  window with HashMap
	 * Create a map for given first input 
	 * Create another map for for second input
	 * create list for out put
	 * Iterate p Value and add it in first map 
	 * Iterate s value and add it in second map
	 *  a)if length of j is equal to length of p 
	 *  b)remove index of zero and add j value 
	 *  Compare two maps and return its value  in list 
	 */
	
	
	public void examplePositiveData()
	{
		String s = "cbaebabacd";
		String k = "abc";
		
		anagram(s,k);
		
	}
	@Test
	public void examplePositiveData1()
	{
		String s = "cbaebabacd";
		String k = "abc";
		
		anagram2(s,k);
		
	}
	
	@Test
	public void exampleEdgeCase()
	{
		String s = "abab";
		String k = "ab";
		
		anagram1(s,k);
		
	}
//n*m
	//o[n]
	private void anagram(String s, String k) {
		// TODO Auto-generated method stub
		
		int sLength = s.length();
		int kLength= k.length();
		
		HashMap <Character,Integer> map = new HashMap<>();
		HashMap<Character,Integer> kmap = new HashMap<>();
		
		List<Integer> output = new ArrayList<Integer>();
		
		for(int i=0;i<kLength;i++)
		{
			map.put(k.charAt(i),map.getOrDefault(k.charAt(i), 0)+1);
			
		}
		
		for(int j=0;j<sLength;j++)
		{
			kmap.put(s.charAt(j),kmap.getOrDefault(s.charAt(j), 0)+1);
			
			if(j>=kLength)
			{
				char ch = s.charAt(j-kLength);
				
				if(kmap.get(ch)==1)
				{
					kmap.remove(ch);
				}else
				{
					kmap.put(ch, kmap.get(ch)- 1);
				}
			}
			
			if(map.equals(kmap))
			{
				int tem = kLength-1;
				output.add(j-tem);
				
			}
			
		}
		
		System.out.println(output);
		
	}

	private void anagram1(String s, String t)
	{
		HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();
        char[] sh = s.toCharArray();
        char[] th = t.toCharArray();
        for(int i=0;i<sh.length;i++)
        {
            smap.put(sh[i], smap.getOrDefault(sh[i], 0)+1);
        }
        for(int i=0;i<th.length;i++)
        {
            tmap.put(th[i], tmap.getOrDefault(th[i], 0)+1);
        }

        if(smap.equals(tmap))
        {
            System.out.print("Anagram");
        }else
        {
        	 System.out.print("not anagram");
        }
        
        for(Map.Entry<Character,Integer> ch : smap.entrySet())
        {
        	System.out.println("keys:" + ch.getKey()+ "values:" +ch.getValue());
        	
        }
	}

	private boolean anagram2(String s, String t)
	{
		if(s.length() != t.length()) return false;
        int[] ascii_array = new int[26];
        
        for(char c : s.toCharArray())
        {
            ascii_array[c-'a']++;
        }
        
        for(char c: t.toCharArray())
        {
            if(ascii_array[c-'a']==0) return false;
          ascii_array[c-'a']--;
        }
        
        return true;
	}
}
