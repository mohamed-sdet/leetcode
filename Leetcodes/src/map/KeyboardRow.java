package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class KeyboardRow {
	
	
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
		    HashSet<String> s1 = new HashSet<>(Arrays.asList("q,w,e,r,t,y,u,i,o,p"));
	        HashSet<String> s2 = new HashSet<>(Arrays.asList("a,s,d,f,g,h,j,k,l"));
	        HashSet<String> s3 = new HashSet<>(Arrays.asList("z","x","c","v", "b","n","m"));
	        
	        ArrayList<String> outputList = new ArrayList<>();
	        
	        boolean flag1 = false;
	        boolean flag2 = false;
	        boolean flag3 = false;
	     
	        for(int i=0;i<words.length;i++)
	        {
	        	
	            for(int j=0;j<words[i].length();j++)
	            {

	            	char word= words[i].toLowerCase().charAt(j);
	                if(s1.contains(word))
	                {
	                	
	                	flag1 = true; 
	                } else flag1=false;
	                if( s2.contains(word))
	                {
	                	
	                	flag2 = true; 
	                }else flag2=false;
	                if( s3.contains(word))
	                {
	                	
	                	flag3 = true; 
	                }else flag3=false;
   
	            }
	            if(flag1 ==true)
                {
	            	outputList.add(words[i]);
	            	System.out.print(words[i]);
	            	flag1 = false;
	            	
                }else if(flag2== true)
                {
                	outputList.add(words[i]);
                	System.out.print(words[i]);
	            	flag2 = false;
                }else if(flag3== true)
                {
                	outputList.add(words[i]);
                	System.out.print(words[i]);
	            	flag3 = false;
                }
	        }
	        
	        System.out.print(outputList);
	}
	
	
	

}
