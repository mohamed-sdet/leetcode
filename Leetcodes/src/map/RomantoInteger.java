package map;

import java.util.HashMap;

import org.junit.Test;

public class RomantoInteger {

	
	
			/*Add given Symbol and values in map 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 */
	
	
	@Test
	public void examplePositiveData()
	{
		
		String s = "III";
		
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
	            if((s.charAt(j))=='I'&& j<len-1 && (s.charAt(j+1)=='X' ||s.charAt(len+1)=='V'))
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
