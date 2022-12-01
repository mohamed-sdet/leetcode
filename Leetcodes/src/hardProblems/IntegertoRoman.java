package hardProblems;

import org.junit.Test;

public class IntegertoRoman {
	
	//https://leetcode.com/problems/integer-to-roman/
	
	
	/*Iterate and store the symbols in String Array 
	 * Iterate and store the values in Integer Array 
	 * Initialize for loop 
	 * 
	 * 
	 * 
	 */
	@Test
	public void exampleData()
	{
		
		int num = 3;
		intToRoman(num);
	}
	@Test
	public void exampleData1()
	{
		
		int num = 8;
		intToRoman(num);
	}
	
	
	 public void  intToRoman(int num) {
	        
	       // int [] value = {1,5,10,50,100,500,1000};
	        //String[] symbol ={"I","V","X","L","C","D","M"};
	        
	        int [] value = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
	        String[] symbol ={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
	        
	        StringBuilder out = new StringBuilder();
	        
	        for(int i =value.length-1;i>=0;i--)
	        {
	            while(num>=value[i])
	            {
	                num = num - value[i];
	                out.append(symbol[i]);
	                
	            }
	            
	        }
	       System.out.print(out.toString());;
	    }

}
