package twoPointers;

import org.junit.Test;

public class MergeStringsAlternately {
	
	@Test
	public void exampleData()
	{
		String word1 = "abc";
		String word2 = "pqr";
		
		mergeStringAlternately(word1,word2);	
	}
	@Test
	public void exampleEdgeData()
	{
		String word1 = "ab";
		String word2 = "pqrs";
		
		mergeStringAlternately(word1,word2);	
	}
	@Test
	public void exampleEdgeData2()
	{
		String word1 = "abcd";
		String word2 = "pq";
		
		mergeStringAlternately(word1,word2);	
	}

	private void mergeStringAlternately(String word1, String word2) {
		// TODO Auto-generated method stub
		
		int left=0 ,right=0;
        String out="";
        while(left<word1.length() || right<word2.length())
        {
            if(left>=word1.length())
            {
                out = out + word2.charAt(right);
                right++;
            }else if(right>=word2.length())
            {
                out=out + word1.charAt(left);
                left++;
            }else 
            {
                out = out+ word1.charAt(left)+word2.charAt(right);
                left++;
                right++;
            }

        }
        
        System.out.print(out);
		
	}

}
