package assesment;

import org.junit.Test;

public class Ass2_ValidPalindrome {
	
	//https://leetcode.com/problems/valid-palindrome/description/
	
	  /* Algorithm Two pointers with Opposite Direction 
     * From the given string remove special characters and space 
     * Covert the given string to char array 
     * Initialize left pointer as zero 
     * Initialize right pointer as length -1
     * Initialize while condition with left not greater than right 
     * swap the left and right value 
     * then compare original value with reversed value if true then return true else return false 
     */

     //Time=O(n/2)
     //space =O(n);
	
	@Test
	public void examplePostiveData()
	{
		String s = "A man, a plan, a canal: Panama";
		
		 bruteForce(s);
	}

	private void bruteForce(String s) {
		// TODO Auto-generated method stub
		
		String split = s.replaceAll("^a-zA-Z0-9]","").toLowerCase();
		
		StringBuilder sb = new StringBuilder();
		for(int i=split.length()-1;i>=0;i--)
		{
			sb = sb.append(split.charAt(i));
		}
		System.out.println(sb);
		if(sb.equals(split)) System.out.print("true");
		else System.out.print("false");
	}

}
