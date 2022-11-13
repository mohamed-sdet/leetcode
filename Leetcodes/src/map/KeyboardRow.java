package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class KeyboardRow {
	
	/*https://leetcode.com/problems/keyboard-row/
	/* Iterate given first row and store it in a  set 1
	/*Iterate given first row and store it in a set 2
	 *Iterate given first row and store in a set 3
	 *Now compare the given stings on above 3 sets one by one 
	 *If any one of the set matches store the values in list 
	 * now iterate list values to string and return values
	 */
	
	@Test
	public void examplePositiveData()
	{
		
		String[] words = {"Hello","Alaska","Dad","Peace"};
		keyboardRow(words);
	}

	private void keyboardRow(String[] words) {
		// TODO Auto-generated method stub
		    HashSet<Character> s1 = new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
	        HashSet<Character> s2 = new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
	        HashSet<Character> s3 = new HashSet<>(Arrays.asList('z','x','c','v','b','n','m'));

	        ArrayList<String> outputList = new ArrayList<>();
	        
	        int flag1 = 0;
	        int flag2 = 0;
	        int flag3 = 0;
	     
	        for(int i=0;i<words.length;i++)
	        {
	        	
	            for(int j=0;j<words[i].length();j++)
	            {
	            	char word0 = words[i].toLowerCase().charAt(0);
	            	char word= words[i].toLowerCase().charAt(j);
	                if(s1.contains(word0)&& s1.contains(word))
	                {
	                	
	                	flag1++; 
	                } 
	                if( s2.contains(word0) && s2.contains(word))
	                {
	                	
	                	flag2++; 
	                }
	                if( s3.contains(word0) && s3.contains(word))
	                {
	                	
	                	flag3++; 
	                }
   
	            }
	            if(flag1 ==words[i].length())
                {
	            	outputList.add(words[i]);

	            	flag1 = 0;
	            	
                }else flag1 = 0;
                	
                if(flag2== words[i].length())
                {
                	outputList.add(words[i]);

	            	flag2 = 0;
                }else flag2 = 0;
                if(flag3==words[i].length())
                {
                	outputList.add(words[i]);
   
	            	flag3 = 0;
                } else flag3 = 0;
	        }
	        
	        String [] result = new String[outputList.size()];
	        
	        for(int i=0;i<result.length;i++)
	        {
	        	result[i] = outputList.get(i);
	        }

	        System.out.print(Arrays.toString(result));
	}
	
	
	

}
