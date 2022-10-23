package arrays;
import java.util.Arrays;

import org.junit.Test;


public class MergeStringAlternate {
	
	
	
	
	@Test
	public void exampleposivite()
	{
		String word1 = "abc";
		String word2 = "pqr";
		
		mergeAlternately(word1,word2);
	}

	private void mergeAlternately(String word1, String word2) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		int len =word1.length()+word2.length();
		char [] output = new char [len];
		
		char[] w1 = word1.toCharArray();
		char[]  w2= word2.toCharArray();
		
		for(int i=0;i<=output.length-1;i++)
		{
			//output[i]= (char) (w1[1]+w2[1]);
			
			sb.append(w1[i]);
			sb.append(w2[i]);
			System.out.println(sb.toString());
		}
			
		
		System.out.println(sb.toString());
		
		
		
	}
				
				
		
		
		
		
	

}
