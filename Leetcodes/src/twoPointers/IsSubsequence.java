package twoPointers;

import org.junit.Test;

public class IsSubsequence {
	
	@Test
	public void examplePositiveData()
	{
		
		String s = "abc";
		String t ="ahbgdc";
		
		isSubsequence(s,t);
	}

	private void isSubsequence(String s, String t) {
		// TODO Auto-generated method stub
		int left=0,right=0,counter=0;
        boolean output = false;
        while (right<t.length())
        {
            char[] s1 = s.toCharArray();
            char[] t1 = t.toCharArray();
            
            if(s.charAt(left) == t.charAt(right))
            {
            	
            	System.out.println(s.charAt(left)+"-"+t.charAt(right));
            	 left++;
            	 right++;
                counter++;
                
                
            }else if(s.charAt(left) != t.charAt(right))
            {
                right++;
            }

        }
        if(counter == s.length())
        {
            output = true;
        }
        
        System.out.print(output);
	}

}
