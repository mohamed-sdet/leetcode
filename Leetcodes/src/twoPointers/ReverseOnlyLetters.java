package twoPointers;

import org.junit.Test;

public class ReverseOnlyLetters {
	
	
	/*917. Reverse Only Letters
	 * Given a string s, reverse the string according to the following rules:
		All the characters that are not English letters remain in the same position.
		All the English letters (lowercase or uppercase) should be reversed.
		Return s after reversing it.
	 */
	
	
	
	 /*Two pointers 
	  * Start set as 0 and end will be input length-1
	  * Swap start and characters 
	  * while swapping check condition is character 
	  * return input
	  */
	
	  @Test
	  public void examplePositive()
	  {
		  String s = "ab-cd";
		  reverseOnlyLetters(s);

	  }

	private void reverseOnlyLetters(String s) {
		// TODO Auto-generated method stub
		
		char [] ch = s.toCharArray();
		int start =0;
		int end = ch.length-1;
		char temp;
		
		while(start<end)
		{
			
			if(Character.isAlphabetic(ch[end]) && Character.isAlphabetic(ch[start]) )
			{
				temp = ch[end];
				ch[end++] = ch[start];
				ch[start--] = temp;
				
			}else if(Character.isAlphabetic(ch[end]))
			{
				end--;
			}else if(Character.isAlphabetic(ch[start]))
			{
				start++;
			}
			break;
		}
		
		System.out.print(ch);
		
		
	}
	
	

}
