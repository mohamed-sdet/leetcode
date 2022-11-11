package map;

import java.util.HashMap;

import org.junit.Test;

public class RomantoInteger {

	
	
	@Test
	public void examplePositiveData()
	{
		
		String s = "III";
		
		romantoInteger(s);
	}

	private void romantoInteger(String s) {
		// TODO Auto-generated method stub
		
		 int output = 0;
	        
	        HashMap<Character,Integer> roman = new HashMap<>();
	        
	        Character[] symbol ={'I','V','X','L','C','D','M'};
	        int  [] value = {1,5,10,50,100,500,1000};
	        
	        for(int i =0;i<symbol.length;i++)
	        {
	            roman.put(symbol[i],value[i]);
	        }
	        
	        for(int j=0;j<s.length();j++)
	        {
	            output += roman.get(s.charAt(j));
	        }
	        
	        System.out.print(output);
		
	}
	
	
}
