package map;

import java.util.HashMap;

import org.junit.Test;

public class RomantoInteger {

	
	
			/*https://leetcode.com/problems/roman-to-integer/
			 * Add given Symbol and values in map 
			 * use condition Iterate through by for loop in reverse 
			*  Check if character is 'V' and prev character is I, then reduce the value by 1
			 * Check if character is 'L' or 'C' and prev character is X, then reduce the value by 10
			 * Check if character is 'D' or 'M' and prev character is C, then reduce the value by 100 below in if else 
			 * return output 
			 */
	
	
	@Test
	public void examplePositiveData()
	{
		
		String s = "III";
		
		romantoInteger(s);
	}
	
	@Test
	public void exampleEdgeData()
	{
		
		String s = "IV";
		
		romantoInteger(s);
	}

	private void romantoInteger(String s) {
		// TODO Auto-generated method stub
		
		 int output = 0;
		 int len= s.length()-1;
	        
	        HashMap<Character,Integer> roman = new HashMap<>();
	        
	        Character[] symbol ={'I','V','X','L','C','D','M'};
	        int  [] value = {1,5,10,50,100,500,1000};
	        
	        for(int i =0;i<symbol.length;i++)
	        {
	            roman.put(symbol[i],value[i]);
	        }

	        
	        for(int j=len-1;j>=0;j--)
	        {
	            if((s.charAt(j))=='I'&& j<len-1 && (s.charAt(j+1)=='X' || s.charAt(len+1)=='V'))
	            	{
	            	  output -= 1;
	            	}
	            else if(s.charAt(len)=='X' && len<s.length()-1 && (s.charAt(len+1)=='L'||s.charAt(len+1)=='C')) output-=10;
	            else if(s.charAt(len)=='C' && len<s.length()-1 && (s.charAt(len+1)=='D'||s.charAt(len+1)=='M'))output-=100;
	            else output+=roman.get(s.charAt(len));
	        }
	        
	        System.out.print(output);
	        
		
	}
	
	
}
