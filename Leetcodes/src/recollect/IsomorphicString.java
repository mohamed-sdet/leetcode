package recollect;


import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class IsomorphicString {
	
	@Test
	public void exampleData()
	{
		
		String s = "egg";
		String t = "add";
		
		System.out.print(isomorphic(s,t));
		
	}

	private boolean isomorphic(String s, String t) {
		// TODO Auto-generated method stub
	
		HashMap<Character,Character> map = new HashMap<>();
		HashMap<Character,Character> map1 = new HashMap<>();
		char [] sch= s.toCharArray();
		char [] tch= t.toCharArray();
		for(int i=0;i<sch.length;i++)
		{
			map.put(sch[i], tch[i]);
			map1.put(tch[i], sch[i]);
		}
		
		for(int i=0;i<sch.length;i++)
		{
			if(map.get(sch[i]) != tch[i])
			{
				return false;
			}
			
			if( map1.get(tch[i]) != sch[i])
			{
				return false;
			}
		}
		return true;
		
		
	}
	
	private boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> smap= new HashMap();
        HashMap<Character, Character> tmap= new HashMap();
        if(s.length()!= t.length()) return false;
        for(int i=0;i<s.length();i++){
            smap.put(s.charAt(i),t.charAt(i));
            tmap.put(t.charAt(i),s.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            if(!(smap.get(s.charAt(i))==t.charAt(i) && tmap.get(t.charAt(i))==s.charAt(i)))
                return false;
        }
        return true;
    }

}
