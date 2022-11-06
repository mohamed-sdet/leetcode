package map;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

class LongestSubstringWithoutRepeatingCharacters {
	
	@Test
	public void examplePositiveData()
	{
		String s = "abcabcbb";
		
		
		longestSubstringWithoutRepeatingCharactersHashSet(s);
	}

	private void  longestSubstringWithoutRepeatingCharacters(String s) {
		// TODO Auto-generated method stub
		
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        
        for(int i=0; i<s.length(); i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
             
             if(map.containsKey(s.charAt(i))) 
             {
                char temp = s.charAt(i);
                 
                 if(map.get(temp)==1)
                 {
                     map.remove(map.get(temp));
                     
                 }else
                 {
                     map.put(temp,map.get(temp)-1);
                     
                 }
                 
             }  
        }
    
    System.out.print(map.size());
	}

	 
	public void longestSubstringWithoutRepeatingCharactersHashSet(String s)
	{
		int right =0 ,left=0,max=0;
		HashSet<Character> set = new HashSet<Character>();
		
		while(right<s.length())
		{
			if(!set.add(s.charAt(right)))
			{
				max= Math.max(max, set.size());
				
			}else
			{
				left++;
				right=left;
				
			}
		}
		
		System.out.print(max);
		
		
	}
	
	
}
